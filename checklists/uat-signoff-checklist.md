# UAT Sign-Off Checklist

**Project:** *[Project Name]*
**Release/Version:** *[Version Number]*
**UAT Cycle Dates:** *[Start Date] – [End Date]*
**Prepared by:** Narmada Nagarajan

Use this checklist to confirm a release has cleared User Acceptance Testing and is ready for production sign-off.

## 1. Test Coverage
- [ ] All planned UAT test cases have been executed
- [ ] All requirements/user stories in scope have at least one linked test case (traceability matrix updated)
- [ ] Test cases covering high-priority/critical business flows are marked **Pass**
- [ ] Any out-of-scope items are explicitly documented and agreed with stakeholders

## 2. Defects
- [ ] All Critical and High severity defects found during UAT are resolved and re-verified
- [ ] Any open Medium/Low severity defects have a documented workaround or are accepted as known issues
- [ ] Defect log is up to date in the tracking tool (JIRA/ALM/Qtest) with final status
- [ ] No defects are in "Open" or "In Progress" state without stakeholder sign-off to proceed

## 3. Test Evidence
- [ ] Screenshots/evidence attached for all executed test cases
- [ ] Test execution results exported and stored (e.g., Qtest/ALM execution report)
- [ ] Test data used during UAT is documented for repeatability

## 4. Environment & Data
- [ ] UAT environment configuration matches (or is documented as different from) production
- [ ] Test data has been refreshed/cleaned as needed post-UAT
- [ ] Any environment-specific issues encountered during UAT are noted

## 5. Business Sign-Off
- [ ] Business/Product Owner has reviewed test summary report
- [ ] Formal written sign-off received from Business/Product Owner
- [ ] Sign-off email or document is stored/linked for audit purposes

## 6. Release Readiness
- [ ] Release notes prepared and reviewed
- [ ] Rollback plan confirmed with the team
- [ ] Go-live checklist shared with relevant stakeholders (Dev, QA, Business, Support)

---

**Final Status:** ☐ Approved for Release &nbsp;&nbsp; ☐ Approved with Known Issues &nbsp;&nbsp; ☐ Not Approved

**Signed off by:** _______________________  **Date:** _______________

---
*This is a generic UAT sign-off template based on standard practices followed across Agile/SAFe delivery projects (retail banking, insurance, and life sciences domains). Adaptable to any project's tracking tool and process.*
