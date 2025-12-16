package com.avito.android.profile_settings;

import Db0.b;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileSettingsMviView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings.ProfileSettingsMviViewImpl$2$1", f = "ProfileSettingsMviView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f228447q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f228448r;

    /* compiled from: ProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings.ProfileSettingsMviViewImpl$2$1$1", f = "ProfileSettingsMviView.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228449q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f228450r;

        /* compiled from: ProfileSettingsMviView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_settings.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6947a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f228451b;

            public C6947a(p pVar) {
                this.f228451b = pVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ProfileSettingsState profileSettingsState = (ProfileSettingsState) obj;
                p pVar = this.f228451b;
                pVar.getClass();
                Throwable th2 = profileSettingsState.f228470d;
                com.avito.android.extended_profile_ui_components.l lVar = pVar.f228508l;
                if (th2 != null) {
                    lVar.c(th2, pVar.f228502f);
                } else if (profileSettingsState.f228469c) {
                    lVar.d();
                } else {
                    ProfileSettingsState.Data data = profileSettingsState.f228468b;
                    if (data != null) {
                        lVar.a();
                        int i12 = 0;
                        I5.a(pVar.f228504h, data.f228472b, false);
                        DeeplinkAction deeplinkAction = data.f228474d;
                        DeepLink deepLink = deeplinkAction != null ? deeplinkAction.getDeepLink() : null;
                        TextView textView = pVar.f228507k;
                        if (deepLink != null) {
                            I5.a(textView, deeplinkAction.getTitle(), false);
                            textView.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(6, pVar, deepLink));
                        } else {
                            D6.w(textView);
                            textView.setOnClickListener(null);
                        }
                        AvitoTabLayout avitoTabLayout = pVar.f228505i;
                        o oVar = pVar.f228509m;
                        avitoTabLayout.n(oVar);
                        List<TabItem> list = data.f228473c;
                        D6.G(avitoTabLayout, list.size() >= 2);
                        pVar.f228501e.E5(list);
                        pVar.f228499c.d();
                        pVar.f228500d.notifyDataSetChanged();
                        String str = profileSettingsState.f228471e;
                        if (str != null) {
                            Iterator<TabItem> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i12 = -1;
                                    break;
                                }
                                if (L.f(it.next().f228384e, str)) {
                                    break;
                                }
                                i12++;
                            }
                            if (i12 != -1) {
                                pVar.f228506j.g(i12, true);
                            }
                        }
                        avitoTabLayout.a(oVar);
                    }
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f228451b, p.class, "render", "render(Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f228450r = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f228450r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228449q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = this.f228450r;
                q qVar = pVar.f228497a;
                C6947a c6947a = new C6947a(pVar);
                this.f228449q = 1;
                if (qVar.ke(c6947a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings.ProfileSettingsMviViewImpl$2$1$2", f = "ProfileSettingsMviView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f228452q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ p f228453r;

        /* compiled from: ProfileSettingsMviView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f228454b;

            public a(p pVar) {
                this.f228454b = pVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ActivityC22955m activityC22955mL1;
                p pVar = this.f228454b;
                pVar.getClass();
                if (L.f((Db0.b) obj, b.a.f3257a)) {
                    ProfileSettingsMviFragment profileSettingsMviFragment = pVar.f228498b;
                    if (!profileSettingsMviFragment.i0() && (activityC22955mL1 = profileSettingsMviFragment.l1()) != null) {
                        activityC22955mL1.finish();
                    }
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f228454b, p.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f228453r = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f228453r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f228452q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = this.f228453r;
                q qVar = pVar.f228497a;
                a aVar = new a(pVar);
                this.f228452q = 1;
                Object objCollect = qVar.getEvents().collect(aVar, this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f228448r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f228448r, continuation);
        mVar.f228447q = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f228447q;
        p pVar = this.f228448r;
        C43259k.d(t12, null, null, new a(pVar, null), 3);
        C43259k.d(t12, null, null, new b(pVar, null), 3);
        return G0.f406611a;
    }
}
