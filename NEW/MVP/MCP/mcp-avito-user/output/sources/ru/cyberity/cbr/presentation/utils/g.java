package ru.cyberity.cbr.presentation.utils;

import Y61.k;
import Y61.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.g;

/* compiled from: ApplicantExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/FieldName;", "field", "", "a", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/FieldName;)Ljava/lang/String;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class g {

    /* compiled from: ApplicantExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435632a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.firstName.ordinal()] = 1;
            iArr[FieldName.lastName.ordinal()] = 2;
            iArr[FieldName.middleName.ordinal()] = 3;
            iArr[FieldName.tin.ordinal()] = 4;
            iArr[FieldName.phone.ordinal()] = 5;
            iArr[FieldName.countryOfBirth.ordinal()] = 6;
            iArr[FieldName.stateOfBirth.ordinal()] = 7;
            iArr[FieldName.placeOfBirth.ordinal()] = 8;
            iArr[FieldName.legalName.ordinal()] = 9;
            iArr[FieldName.gender.ordinal()] = 10;
            iArr[FieldName.nationality.ordinal()] = 11;
            iArr[FieldName.dob.ordinal()] = 12;
            iArr[FieldName.email.ordinal()] = 13;
            iArr[FieldName.buildingNumber.ordinal()] = 14;
            iArr[FieldName.flatNumber.ordinal()] = 15;
            iArr[FieldName.postCode.ordinal()] = 16;
            iArr[FieldName.state.ordinal()] = 17;
            iArr[FieldName.street.ordinal()] = 18;
            iArr[FieldName.subStreet.ordinal()] = 19;
            iArr[FieldName.town.ordinal()] = 20;
            f435632a = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @l
    public static final String a(@k ru.cyberity.cbr.core.data.model.g gVar, @k FieldName fieldName) {
        List<Map<String, String>> listN;
        Map map;
        switch (a.f435632a[fieldName.ordinal()]) {
            case 1:
                g.a aVar = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar != null) {
                    return aVar.getFirstName();
                }
                return null;
            case 2:
                g.a aVar2 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar2 != null) {
                    return aVar2.getLastName();
                }
                return null;
            case 3:
                g.a aVar3 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar3 != null) {
                    return aVar3.getMiddleName();
                }
                return null;
            case 4:
                g.a aVar4 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar4 != null) {
                    return aVar4.getTin();
                }
                return null;
            case 5:
                return gVar.getPhone();
            case 6:
                g.a aVar5 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar5 != null) {
                    return aVar5.getCountryOfBirth();
                }
                return null;
            case 7:
                g.a aVar6 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar6 != null) {
                    return aVar6.getStateOfBirth();
                }
                return null;
            case 8:
                g.a aVar7 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar7 != null) {
                    return aVar7.getPlaceOfBirth();
                }
                return null;
            case 9:
                g.a aVar8 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar8 != null) {
                    return aVar8.getLegalName();
                }
                return null;
            case 10:
                g.a aVar9 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar9 != null) {
                    return aVar9.getGender();
                }
                return null;
            case 11:
                g.a aVar10 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar10 != null) {
                    return aVar10.getNationality();
                }
                return null;
            case 12:
                g.a aVar11 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar11 != null) {
                    return aVar11.getDob();
                }
                return null;
            case 13:
                return gVar.getEmail();
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                g.a aVar12 = gVar.getCom.avito.android.remote.model.messenger.RequestReviewResultKt.INFO_TYPE java.lang.String();
                if (aVar12 != null && (listN = aVar12.n()) != null && (map = (Map) C42745f0.G(listN)) != null) {
                    return (String) map.get(fieldName.getValue());
                }
                return null;
            default:
                return null;
        }
    }
}
