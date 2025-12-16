package com.avito.android.avito_finance_user_profile.view.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.avito_finance_user_profile.pub.generated.api.api_2_profile_finance_get.FinanceWidgetFeature;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceAction;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCard;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCardBackground;
import com.avito.android.avito_finance_user_profile.view.model.AvitoFinanceCardButton;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35787f0;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jg.C42372a;
import jg.C42373b;
import jg.C42374c;
import jg.e;
import jg.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import lg.C43765a;
import og.C44772a;

/* compiled from: AvitoFinanceInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/domain/b;", "Lcom/avito/android/avito_finance_user_profile/view/domain/a;", "a", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.avito_finance_user_profile.view.domain.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f97982d = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43765a f97983a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f97984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f97985c;

    /* compiled from: AvitoFinanceInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/domain/b$a;", "", "<init>", "()V", "", "UNKNOWN_ID", "Ljava/lang/String;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoFinanceInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Log/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.avito_finance_user_profile.view.domain.AvitoFinanceInteractorImpl$getAvitoFinanceBlock$2", f = "AvitoFinanceInteractorImpl.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.avito_finance_user_profile.view.domain.b$b, reason: collision with other inner class name */
    public static final class C2937b extends SuspendLambda implements p<T, Continuation<? super TypedResult<C44772a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97986q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f97988s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2937b(String str, Continuation<? super C2937b> continuation) {
            super(2, continuation);
            this.f97988s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C2937b(this.f97988s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C44772a>> continuation) {
            return ((C2937b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objApi2ProfileFinanceGet;
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            Iterator it;
            AvitoFinanceCardBackground avitoFinanceCardBackground;
            Iterator it2;
            AvitoFinanceCardButton avitoFinanceCardButton;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            UniversalColor universalColor;
            Color color;
            Integer numA;
            Integer numA2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97986q;
            b bVar = b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                C43765a c43765a = bVar.f97983a;
                this.f97986q = 1;
                objApi2ProfileFinanceGet = c43765a.f414142a.get().api2ProfileFinanceGet(this.f97988s, this);
                if (objApi2ProfileFinanceGet == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objApi2ProfileFinanceGet = obj;
            }
            TypedResult typedResult = (TypedResult) objApi2ProfileFinanceGet;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            C42372a c42372a = (C42372a) ((TypedResult.Success) typedResult).getResult();
            int i13 = b.f97982d;
            bVar.getClass();
            String title = c42372a.getWidget().getTitle();
            List<List<FinanceWidgetFeature>> listA = c42372a.getWidget().a();
            int i14 = 10;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(listA, 10));
            Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                List list = (List) it3.next();
                ArrayList arrayList8 = new ArrayList(C42745f0.q(list, i14));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    FinanceWidgetFeature financeWidgetFeature = (FinanceWidgetFeature) it4.next();
                    FinanceWidgetFeature.Id id2 = financeWidgetFeature.getId();
                    if (id2 == null || (str = id2.f97974b) == null) {
                        str = "unknown_card_id";
                    }
                    String str2 = str;
                    String title2 = financeWidgetFeature.getTitle();
                    String subtitle = financeWidgetFeature.getSubtitle();
                    e image = financeWidgetFeature.getImage();
                    UniversalImage universalImage = image != null ? new UniversalImage(image.getValue(), image.getValueDark()) : null;
                    FinanceWidgetFeature.ImagePosition imagePosition = financeWidgetFeature.getImagePosition();
                    String str3 = imagePosition != null ? imagePosition.f97977b : null;
                    C42373b background = financeWidgetFeature.getBackground();
                    if (background != null) {
                        String gradient = background.getGradient();
                        jg.d color2 = background.getColor();
                        if (color2 != null) {
                            String valueName = color2.getValueName();
                            String value = color2.getValue();
                            if (value == null || (numA2 = C35787f0.a(value)) == null) {
                                it = it3;
                                color = null;
                            } else {
                                it = it3;
                                color = new Color(numA2.intValue());
                            }
                            String valueDark = color2.getValueDark();
                            universalColor = new UniversalColor(valueName, (valueDark == null || (numA = C35787f0.a(valueDark)) == null) ? null : new Color(numA.intValue()), color);
                        } else {
                            it = it3;
                            universalColor = null;
                        }
                        avitoFinanceCardBackground = new AvitoFinanceCardBackground(gradient, universalColor);
                    } else {
                        it = it3;
                        avitoFinanceCardBackground = null;
                    }
                    C42374c button = financeWidgetFeature.getButton();
                    if (button != null) {
                        String title3 = button.getTitle();
                        String style = button.getStyle();
                        List<g> listB = button.b();
                        if (listB != null) {
                            List<g> list2 = listB;
                            it2 = it4;
                            arrayList5 = new ArrayList(C42745f0.q(list2, 10));
                            Iterator<T> it5 = list2.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(bVar.b((g) it5.next()));
                            }
                        } else {
                            it2 = it4;
                            arrayList5 = null;
                        }
                        List<g> listA2 = button.a();
                        if (listA2 != null) {
                            List<g> list3 = listA2;
                            arrayList6 = new ArrayList(C42745f0.q(list3, 10));
                            Iterator<T> it6 = list3.iterator();
                            while (it6.hasNext()) {
                                arrayList6.add(bVar.b((g) it6.next()));
                            }
                        } else {
                            arrayList6 = null;
                        }
                        avitoFinanceCardButton = new AvitoFinanceCardButton(title3, style, arrayList5, arrayList6);
                    } else {
                        it2 = it4;
                        avitoFinanceCardButton = null;
                    }
                    Long weight = financeWidgetFeature.getWeight();
                    Integer numValueOf = weight != null ? Integer.valueOf((int) weight.longValue()) : null;
                    List<g> listG = financeWidgetFeature.g();
                    if (listG != null) {
                        List<g> list4 = listG;
                        ArrayList arrayList9 = new ArrayList(C42745f0.q(list4, 10));
                        Iterator<T> it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList9.add(bVar.b((g) it7.next()));
                        }
                        arrayList3 = arrayList9;
                    } else {
                        arrayList3 = null;
                    }
                    List<g> listF = financeWidgetFeature.f();
                    if (listF != null) {
                        List<g> list5 = listF;
                        ArrayList arrayList10 = new ArrayList(C42745f0.q(list5, 10));
                        Iterator<T> it8 = list5.iterator();
                        while (it8.hasNext()) {
                            arrayList10.add(bVar.b((g) it8.next()));
                        }
                        arrayList4 = arrayList10;
                    } else {
                        arrayList4 = null;
                    }
                    arrayList8.add(new AvitoFinanceCard(str2, title2, subtitle, universalImage, str3, avitoFinanceCardBackground, avitoFinanceCardButton, numValueOf, arrayList3, arrayList4));
                    it3 = it;
                    it4 = it2;
                }
                arrayList7.add(arrayList8);
                i14 = 10;
            }
            List<g> listC = c42372a.getWidget().c();
            if (listC != null) {
                List<g> list6 = listC;
                arrayList = new ArrayList(C42745f0.q(list6, 10));
                Iterator<T> it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList.add(bVar.b((g) it9.next()));
                }
            } else {
                arrayList = null;
            }
            List<g> listB2 = c42372a.getWidget().b();
            if (listB2 != null) {
                List<g> list7 = listB2;
                arrayList2 = new ArrayList(C42745f0.q(list7, 10));
                Iterator<T> it10 = list7.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(bVar.b((g) it10.next()));
                }
            } else {
                arrayList2 = null;
            }
            return new TypedResult.Success(new C44772a(title, arrayList7, arrayList, arrayList2));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k C43765a c43765a, @k R0 r02, @k x xVar) {
        this.f97983a = c43765a;
        this.f97984b = r02;
        this.f97985c = xVar;
    }

    @l
    public final Object a(@l String str, @k Continuation<? super TypedResult<C44772a>> continuation) {
        return C43259k.g(this.f97984b.a(), new C2937b(str, null), continuation);
    }

    public final AvitoFinanceAction b(g gVar) {
        if (gVar instanceof g.a) {
            return new AvitoFinanceAction.OpenDeeplink(this.f97985c.b(((g.a) gVar).getUrl()));
        }
        if (!(gVar instanceof g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        g.b bVar = (g.b) gVar;
        return new AvitoFinanceAction.SendEvent(bVar.getId(), bVar.c(), bVar.getVersion(), bVar.getHasSensitiveData());
    }
}
