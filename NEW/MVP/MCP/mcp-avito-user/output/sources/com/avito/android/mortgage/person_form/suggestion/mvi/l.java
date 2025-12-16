package com.avito.android.mortgage.person_form.suggestion.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.AddressSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FioSuggestion;
import com.avito.android.mortgage.api.model.suggestions.FmsUnitSuggestion;
import com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestionReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "LH00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<SuggestionInternalAction, H00.c> {
    @Inject
    public l() {
    }

    public static SuggestionContainer b(SuggestionContainer suggestionContainer) {
        Suggestion suggestionA;
        Suggestion suggestionC = suggestionContainer.c();
        if (suggestionC instanceof AddressSuggestion) {
            AddressSuggestion addressSuggestion = (AddressSuggestion) suggestionContainer.c();
            String block = addressSuggestion.getBlock();
            String str = block == null ? "" : block;
            String city = addressSuggestion.getCity();
            String str2 = city == null ? "" : city;
            String country = addressSuggestion.getCountry();
            String str3 = country == null ? "" : country;
            String flat = addressSuggestion.getFlat();
            String str4 = flat == null ? "" : flat;
            String house = addressSuggestion.getHouse();
            String str5 = house == null ? "" : house;
            String region = addressSuggestion.getRegion();
            String str6 = region == null ? "" : region;
            String regionId = addressSuggestion.getRegionId();
            String str7 = regionId == null ? "" : regionId;
            String settlement = addressSuggestion.getSettlement();
            String str8 = settlement == null ? "" : settlement;
            String street = addressSuggestion.getStreet();
            String str9 = street == null ? "" : street;
            String zip = addressSuggestion.getZip();
            suggestionA = new AddressSuggestion(str, str2, str3, str4, str5, str6, str7, str8, str9, zip == null ? "" : zip);
        } else if (suggestionC instanceof FioSuggestion) {
            FioSuggestion fioSuggestion = (FioSuggestion) suggestionContainer.c();
            String firstName = fioSuggestion.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String middleName = fioSuggestion.getMiddleName();
            if (middleName == null) {
                middleName = "";
            }
            String lastName = fioSuggestion.getLastName();
            suggestionA = FioSuggestion.a(fioSuggestion, firstName, middleName, lastName != null ? lastName : "", 8);
        } else if (suggestionC instanceof FmsUnitSuggestion) {
            FmsUnitSuggestion fmsUnitSuggestion = (FmsUnitSuggestion) suggestionContainer.c();
            String code = fmsUnitSuggestion.getCode();
            if (code == null) {
                code = "";
            }
            String name = fmsUnitSuggestion.getName();
            if (name == null) {
                name = "";
            }
            String regionCode = fmsUnitSuggestion.getRegionCode();
            if (regionCode == null) {
                regionCode = "";
            }
            String type = fmsUnitSuggestion.getType();
            suggestionA = new FmsUnitSuggestion(code, name, regionCode, type != null ? type : "");
        } else {
            if (!(suggestionC instanceof OrganizationSuggestion)) {
                throw new NoWhenBranchMatchedException();
            }
            OrganizationSuggestion organizationSuggestion = (OrganizationSuggestion) suggestionContainer.c();
            String inn = organizationSuggestion.getInn();
            if (inn == null) {
                inn = "";
            }
            String name2 = organizationSuggestion.getName();
            suggestionA = OrganizationSuggestion.a(organizationSuggestion, inn, name2 != null ? name2 : "", null, 110);
        }
        return new SuggestionContainer(suggestionA, suggestionContainer.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H00.c a(com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction r7, H00.c r8) {
        /*
            r6 = this;
            com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction r7 = (com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction) r7
            r0 = r8
            H00.c r0 = (H00.c) r0
            boolean r8 = r7 instanceof com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.Error
            if (r8 == 0) goto L15
            r2 = 0
            r5 = 95
            r1 = 0
            r3 = 0
            r4 = 0
            H00.c r0 = H00.c.a(r0, r1, r2, r3, r4, r5)
            goto L94
        L15:
            boolean r8 = r7 instanceof com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.Loading
            if (r8 == 0) goto L25
            r2 = 0
            r5 = 127(0x7f, float:1.78E-43)
            r1 = 0
            r3 = 0
            r4 = 1
            H00.c r0 = H00.c.a(r0, r1, r2, r3, r4, r5)
            goto L94
        L25:
            boolean r8 = r7 instanceof com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.SuggestionsLoaded
            com.avito.android.mortgage.api.model.SuggestionContainer<? extends com.avito.android.mortgage.api.model.suggestions.Suggestion> r1 = r0.f6920h
            r2 = 0
            if (r8 == 0) goto L61
            com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction$SuggestionsLoaded r7 = (com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.SuggestionsLoaded) r7
            java.util.ArrayList r7 = r7.f201472b
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L47
            if (r1 == 0) goto L3d
            java.lang.String r8 = r1.getValue()
            goto L3e
        L3d:
            r8 = r2
        L3e:
            java.lang.String r3 = r0.f6916d
            boolean r8 = kotlin.jvm.internal.L.f(r3, r8)
            if (r8 == 0) goto L47
            goto L4e
        L47:
            java.lang.Object r8 = kotlin.collections.C42745f0.G(r7)
            r1 = r8
            com.avito.android.mortgage.api.model.SuggestionContainer r1 = (com.avito.android.mortgage.api.model.SuggestionContainer) r1
        L4e:
            if (r1 == 0) goto L56
            com.avito.android.mortgage.api.model.SuggestionContainer r8 = b(r1)
            r3 = r8
            goto L57
        L56:
            r3 = r2
        L57:
            r1 = 0
            r5 = 31
            r4 = 0
            r2 = r7
            H00.c r0 = H00.c.a(r0, r1, r2, r3, r4, r5)
            goto L94
        L61:
            boolean r8 = r7 instanceof com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.ValueChanged
            if (r8 == 0) goto L7c
            com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction$ValueChanged r7 = (com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.ValueChanged) r7
            java.lang.String r7 = r7.f201473b
            int r8 = r7.length()
            if (r8 != 0) goto L71
            r3 = r2
            goto L72
        L71:
            r3 = r1
        L72:
            r4 = 0
            r5 = 187(0xbb, float:2.62E-43)
            r2 = 0
            r1 = r7
            H00.c r0 = H00.c.a(r0, r1, r2, r3, r4, r5)
            goto L94
        L7c:
            boolean r8 = r7 instanceof com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.SuggestApplied
            if (r8 == 0) goto L94
            com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction$SuggestApplied r7 = (com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction.SuggestApplied) r7
            com.avito.android.mortgage.api.model.SuggestionContainer<? extends com.avito.android.mortgage.api.model.suggestions.Suggestion> r7 = r7.f201471b
            java.lang.String r1 = r7.getValue()
            com.avito.android.mortgage.api.model.SuggestionContainer r3 = b(r7)
            r4 = 0
            r5 = 187(0xbb, float:2.62E-43)
            r2 = 0
            H00.c r0 = H00.c.a(r0, r1, r2, r3, r4, r5)
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.suggestion.mvi.l.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
