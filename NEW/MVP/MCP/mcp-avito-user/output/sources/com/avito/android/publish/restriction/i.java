package com.avito.android.publish.restriction;

import Y41.p;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.Footer;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.publish.restriction.a;
import com.avito.android.publish.restriction.g;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.RestrictionConfig;
import com.avito.android.remote.model.restriction.RestrictionCustomResponse;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.publish.generated.api.api_1_publish_item_restriction_check_get.Flow;
import dl0.InterfaceC39749a;
import fl0.C40437a;
import fl0.C40439c;
import fl0.C40440d;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

/* compiled from: RestrictionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/restriction/RestrictionCustomResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.restriction.RestrictionInteractorImpl$createNewApiCall$1", f = "RestrictionInteractor.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super TypedResult<RestrictionCustomResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f239093q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f239094r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f239095s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RestrictionConfig.Flow f239096t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f239097u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, RestrictionConfig.Flow flow, String str2, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f239094r = gVar;
        this.f239095s = str;
        this.f239096t = flow;
        this.f239097u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f239094r, this.f239095s, this.f239096t, this.f239097u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<RestrictionCustomResponse>> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Flow flow;
        Object objE;
        DetailsSheetLinkBody detailsSheetLinkBody;
        Theme theme;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f239093q;
        g gVar = this.f239094r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC39749a interfaceC39749a = gVar.f239083b;
            int i13 = a.C7186a.f239075a[this.f239096t.ordinal()];
            if (i13 == 1) {
                flow = Flow.Add;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                flow = Flow.Edit;
            }
            String str = this.f239097u;
            Long lBoxLong = str != null ? Boxing.boxLong(Long.parseLong(str)) : null;
            this.f239093q = 1;
            objE = interfaceC39749a.e(this.f239095s, flow, lBoxLong, this);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objE = obj;
        }
        TypedResult typedResult = (TypedResult) objE;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C40437a c40437a = (C40437a) ((TypedResult.Success) typedResult).getResult();
        boolean isAllowed = c40437a.getIsAllowed();
        C40439c content = c40437a.getContent();
        gVar.getClass();
        if (content != null) {
            String title = content.getTitle();
            AttributedText descriptionHeader = content.getDescriptionHeader();
            AttributedText description = content.getDescription();
            String warning = content.getWarning();
            DetailsSheetButton detailsSheetButtonB = gVar.b(content.getButton());
            DetailsSheetButton detailsSheetButtonB2 = gVar.b(content.getSecondaryButton());
            Boolean closeButton = content.getCloseButton();
            Boolean boolValueOf = Boolean.valueOf(closeButton != null ? closeButton.booleanValue() : false);
            Image image = content.getImage();
            C40440d dynamicImage = content.getDynamicImage();
            UniversalImage universalImage = dynamicImage != null ? new UniversalImage(dynamicImage.getValue(), dynamicImage.getValueDark()) : null;
            Double imageRelativeWidth = content.getImageRelativeWidth();
            Float fValueOf = Float.valueOf(imageRelativeWidth != null ? (float) imageRelativeWidth.doubleValue() : 1.0f);
            String theme2 = content.getTheme();
            if (theme2 != null) {
                Iterator it = ((AbstractC42738c) g.a.f239088a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C43066x.C(((Theme) next).f133713b, theme2, true)) {
                        break;
                    }
                }
                Theme theme3 = (Theme) next;
                if (theme3 == null) {
                    theme3 = Theme.AVITO_RE_23;
                }
                theme = theme3;
            } else {
                theme = null;
            }
            fl0.e footer = content.getFooter();
            Footer footer2 = footer != null ? new Footer(footer.getText()) : null;
            Boolean overlayHeader = content.getOverlayHeader();
            Boolean boolValueOf2 = Boolean.valueOf(overlayHeader != null ? overlayHeader.booleanValue() : false);
            String onDismissDeepLink = content.getOnDismissDeepLink();
            detailsSheetLinkBody = new DetailsSheetLinkBody(title, null, descriptionHeader, null, description, warning, detailsSheetButtonB, detailsSheetButtonB2, boolValueOf, image, null, universalImage, null, fValueOf, theme, footer2, boolValueOf2, false, onDismissDeepLink != null ? gVar.f239087f.b(onDismissDeepLink) : null, 136202, null);
        } else {
            detailsSheetLinkBody = null;
        }
        return new TypedResult.Success(new RestrictionCustomResponse(isAllowed, detailsSheetLinkBody));
    }
}
