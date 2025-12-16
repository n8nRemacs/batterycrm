package com.avito.android.rating.details.interactor.converter;

import Hg0.C13987A;
import Hg0.C13988a;
import Hg0.C13989b;
import Hg0.i;
import Hg0.z;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.ParamScoreSummaryEntityScoresItem;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.b;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryContactBar;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: ProfileRatingsConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/converter/b;", "Lcom/avito/android/rating/details/interactor/converter/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.rating.details.interactor.converter.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f247025a;

    /* compiled from: ProfileRatingsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<PhotoGalleryContactBar.ActionType> f247026a = kotlin.enums.c.a(PhotoGalleryContactBar.ActionType.values());

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule> f247027b = kotlin.enums.c.a(ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule.values());

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ReviewEntry.Action.ButtonType> f247028c = kotlin.enums.c.a(ReviewEntry.Action.ButtonType.values());
    }

    /* compiled from: ProfileRatingsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.interactor.converter.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C7418b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f247029a;

        static {
            int[] iArr = new int[ParamScoreSummaryEntityScoresItem.ScoreState.values().length];
            try {
                iArr[ParamScoreSummaryEntityScoresItem.ScoreState.Positive.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamScoreSummaryEntityScoresItem.ScoreState.Negative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f247029a = iArr;
        }
    }

    @Inject
    public b(@k x xVar) {
        this.f247025a = xVar;
    }

    public static TnsGalleryImage b(C13987A c13987a) {
        return new TnsGalleryImage(c13987a.getImage(), (c13987a.getOriginalSize().getWidth() == null || c13987a.getOriginalSize().getHeight() == null) ? null : new Size((int) c13987a.getOriginalSize().getWidth().longValue(), (int) c13987a.getOriginalSize().getHeight().longValue()));
    }

    public static ReviewEntry.Action.ActionValue.ActionValueParams d(Map map) {
        String string;
        String string2;
        String string3;
        if (map.isEmpty()) {
            map = null;
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get("reviewId");
        Integer numY0 = (obj == null || (string3 = obj.toString()) == null) ? null : C43066x.y0(string3);
        Object obj2 = map.get("typeId");
        Integer numY02 = (obj2 == null || (string2 = obj2.toString()) == null) ? null : C43066x.y0(string2);
        Object obj3 = map.get("appealType");
        Integer numY03 = (obj3 == null || (string = obj3.toString()) == null) ? null : C43066x.y0(string);
        Object obj4 = map.get("text");
        return new ReviewEntry.Action.ActionValue.ActionValueParams(numY0, numY02, numY03, obj4 != null ? obj4.toString() : null);
    }

    public static ReviewEntry.Action e(b bVar, String str, ReviewEntry.Action.ActionType actionType, String str2, String str3, Map map, List list, List list2, z zVar, String str4, DeepLink deepLink, DeepLink deepLink2, i iVar, C13988a c13988a, AttributedText attributedText, Hg0.h hVar, int i12) {
        DeepLink deepLink3;
        ReviewEntry.Action.ConfirmationDialog confirmationDialog;
        ArrayList arrayList;
        ReviewEntry.Action.ActionValue.ActionAnswerLengthValidation actionAnswerLengthValidation;
        ArrayList arrayList2;
        ReviewEntry.Action.ActionValue.ActionInfoButtons actionInfoButtons;
        Iterator it;
        ReviewEntry.Action.ActionValue.ActionAnswerLengthValidation actionAnswerLengthValidation2;
        ReviewEntry.Action.ActionValue.ActionValueValidation actionValueValidation;
        Object next;
        Iterator it2;
        DeepLink deepLink4;
        Object next2;
        String str5 = (i12 & 4) != 0 ? null : str2;
        String str6 = (i12 & 8) != 0 ? null : str3;
        Map map2 = (i12 & 16) != 0 ? null : map;
        List list3 = (i12 & 32) != 0 ? null : list;
        List list4 = (i12 & 64) != 0 ? null : list2;
        z zVar2 = (i12 & 128) != 0 ? null : zVar;
        String str7 = (i12 & 256) != 0 ? null : str4;
        DeepLink deepLink5 = (i12 & 512) != 0 ? null : deepLink;
        DeepLink deepLink6 = (i12 & 1024) != 0 ? null : deepLink2;
        i iVar2 = (i12 & 2048) != 0 ? null : iVar;
        C13988a c13988a2 = (i12 & 4096) != 0 ? null : c13988a;
        AttributedText attributedText2 = (i12 & 8192) != 0 ? null : attributedText;
        Hg0.h hVar2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : hVar;
        if (c13988a2 != null) {
            String title = c13988a2.getTitle();
            String text = c13988a2.getText();
            List<C13989b> listA = c13988a2.a();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                C13989b c13989b = (C13989b) it3.next();
                Iterator it4 = ((AbstractC42738c) a.f247028c).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        it2 = it3;
                        deepLink4 = deepLink6;
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    it2 = it3;
                    deepLink4 = deepLink6;
                    if (C43066x.C(((ReviewEntry.Action.ButtonType) next2).name(), c13989b.getType(), true)) {
                        break;
                    }
                    it3 = it2;
                    deepLink6 = deepLink4;
                }
                ReviewEntry.Action.ButtonType buttonType = (ReviewEntry.Action.ButtonType) next2;
                ReviewEntry.Action.Button button = buttonType != null ? new ReviewEntry.Action.Button(c13989b.getText(), buttonType) : null;
                if (button != null) {
                    arrayList3.add(button);
                }
                it3 = it2;
                deepLink6 = deepLink4;
            }
            deepLink3 = deepLink6;
            confirmationDialog = new ReviewEntry.Action.ConfirmationDialog(title, text, arrayList3);
        } else {
            deepLink3 = deepLink6;
            confirmationDialog = null;
        }
        ReviewEntry.Action.ActionValue.ActionAnswerLengthValidation actionAnswerLengthValidation3 = iVar2 != null ? new ReviewEntry.Action.ActionValue.ActionAnswerLengthValidation((int) iVar2.getMin(), (int) iVar2.getMax()) : null;
        ReviewEntry.Action.ActionValue.ActionValueParams actionValueParamsD = map2 != null ? d(map2) : null;
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                ReviewEntry.Action actionC = bVar.c((com.avito.android.rating.generated.api.api_11_profile_ratings_get.b) it5.next());
                if (actionC != null) {
                    arrayList4.add(actionC);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                i iVar3 = (i) it6.next();
                if (iVar3 != null) {
                    int min = (int) iVar3.getMin();
                    actionAnswerLengthValidation2 = actionAnswerLengthValidation3;
                    int max = (int) iVar3.getMax();
                    String message = iVar3.getMessage();
                    Iterator it7 = ((AbstractC42738c) a.f247027b).iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            it = it6;
                            next = null;
                            break;
                        }
                        next = it7.next();
                        it = it6;
                        Iterator it8 = it7;
                        if (L.f(((ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule) next).name(), iVar3.getRule())) {
                            break;
                        }
                        it6 = it;
                        it7 = it8;
                    }
                    actionValueValidation = new ReviewEntry.Action.ActionValue.ActionValueValidation(Integer.valueOf(max), message, Integer.valueOf(min), (ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule) next);
                } else {
                    it = it6;
                    actionAnswerLengthValidation2 = actionAnswerLengthValidation3;
                    actionValueValidation = null;
                }
                if (actionValueValidation != null) {
                    arrayList5.add(actionValueValidation);
                }
                it6 = it;
                actionAnswerLengthValidation3 = actionAnswerLengthValidation2;
            }
            actionAnswerLengthValidation = actionAnswerLengthValidation3;
            arrayList2 = arrayList5;
        } else {
            actionAnswerLengthValidation = actionAnswerLengthValidation3;
            arrayList2 = null;
        }
        if (hVar2 != null) {
            Hg0.g primary = hVar2.getPrimary();
            ReviewEntry.Action.ActionValue.ActionInfoButton actionInfoButton = primary != null ? new ReviewEntry.Action.ActionValue.ActionInfoButton(primary.getTitle(), primary.getLink()) : null;
            Hg0.g secondary = hVar2.getSecondary();
            actionInfoButtons = new ReviewEntry.Action.ActionValue.ActionInfoButtons(actionInfoButton, secondary != null ? new ReviewEntry.Action.ActionValue.ActionInfoButton(secondary.getTitle(), secondary.getLink()) : null);
        } else {
            actionInfoButtons = null;
        }
        return new ReviewEntry.Action(actionType, new ReviewEntry.Action.ActionValue(str, str5, str6, actionValueParamsD, arrayList, arrayList2, zVar2 != null ? new ReviewEntry.Action.ActionValue.ActionValueButton(d(zVar2.a()), zVar2.getTitle(), zVar2.getUrlPath()) : null, str7, deepLink5, deepLink3, actionAnswerLengthValidation, confirmationDialog, attributedText2, actionInfoButtons));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06f0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.avito.android.remote.model.Image] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v0, types: [com.avito.android.remote.model.TypedResult<Hg0.c>, com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult>] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v40, types: [com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry$SearchParametersBlock$InlineBoolFilter] */
    @Override // com.avito.android.rating.details.interactor.converter.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.TypedResult<com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult> a(@Y61.k com.avito.android.remote.model.TypedResult<Hg0.C13990c> r44) {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.interactor.converter.b.a(com.avito.android.remote.model.TypedResult):com.avito.android.remote.model.TypedResult");
    }

    public final ReviewEntry.Action c(com.avito.android.rating.generated.api.api_11_profile_ratings_get.b bVar) {
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            return e(this, aVar.getTitle(), ReviewEntry.Action.ActionType.ANSWER, null, null, null, null, null, null, null, null, null, aVar.getLengthValidation(), null, null, null, 30716);
        }
        if (bVar instanceof b.f) {
            return e(this, ((b.f) bVar).getTitle(), ReviewEntry.Action.ActionType.REMOVE_ANSWER, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
        }
        if (bVar instanceof b.i) {
            b.i iVar = (b.i) bVar;
            return e(this, iVar.getTitle(), ReviewEntry.Action.ActionType.REMOVE_REVIEW, null, null, null, null, null, null, null, null, null, null, iVar.getConfirmDialog(), null, null, 28668);
        }
        if (bVar instanceof b.g) {
            b.g gVar = (b.g) bVar;
            return e(this, gVar.getTitle(), ReviewEntry.Action.ActionType.REMOVE_BUYER_REVIEW, null, null, gVar.b(), null, null, null, null, null, null, null, gVar.getConfirmDialog(), null, null, 28652);
        }
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            return e(this, dVar.getTitle(), ReviewEntry.Action.ActionType.LINK, null, null, null, null, null, null, null, null, dVar.getLink(), null, null, null, null, 31740);
        }
        if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            return e(this, eVar.getTitle(), ReviewEntry.Action.ActionType.NETWORK_REQUEST, null, eVar.getUrlPath(), eVar.a(), null, null, null, null, null, null, null, null, null, null, 32740);
        }
        if (bVar instanceof b.C7426b) {
            b.C7426b c7426b = (b.C7426b) bVar;
            return e(this, c7426b.getTitle(), ReviewEntry.Action.ActionType.BOTTOM_SHEET, null, null, null, c7426b.a(), null, null, c7426b.getHeader(), c7426b.getAnalyticsAction(), null, null, null, null, null, 31964);
        }
        if (bVar instanceof b.j) {
            b.j jVar = (b.j) bVar;
            return e(this, jVar.getTitle(), ReviewEntry.Action.ActionType.TEXT_SHEET, jVar.getPlaceholder(), null, null, null, jVar.d(), jVar.getButton(), null, null, null, null, null, null, null, 32568);
        }
        if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            return e(this, cVar.getTitle(), ReviewEntry.Action.ActionType.INFO, null, null, null, null, null, null, null, null, null, null, null, cVar.getContent(), cVar.getButtons(), 8188);
        }
        if (bVar instanceof b.h ? true : bVar instanceof b.k ? true : L.f(bVar, b.l.f247590a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
