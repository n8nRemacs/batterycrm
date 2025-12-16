package com.avito.android.gig_tutorials.gigtutorials.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.e;
import com.avito.android.R;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.gig.tutorials.generated.api.customer_rules_v_1.Material;
import com.avito.android.gig_tutorials.gigtutorials.mvi.entity.GigTutorialsInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import dH.InterfaceC39580a;
import eH.C40003a;
import eH.C40004b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigTutorialsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/domain/a;", "", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39580a f161128a;

    /* compiled from: GigTutorialsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_tutorials.gigtutorials.domain.GigTutorialsInteractor$requestSlotInfo$1", f = "GigTutorialsInteractor.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.gig_tutorials.gigtutorials.domain.a$a, reason: collision with other inner class name */
    public static final class C4715a extends SuspendLambda implements p<InterfaceC43172j<? super GigTutorialsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f161129q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f161130r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f161132t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4715a(long j12, Continuation<? super C4715a> continuation) {
            super(2, continuation);
            this.f161132t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4715a c4715a = a.this.new C4715a(this.f161132t, continuation);
            c4715a.f161130r = obj;
            return c4715a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GigTutorialsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4715a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objA;
            GigTutorialsInternalAction contentLoaded;
            ?? arrayList;
            List<Material> listA;
            int i12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = this.f161129q;
            a aVar = a.this;
            if (i13 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f161130r;
                InterfaceC39580a interfaceC39580a = aVar.f161128a;
                this.f161130r = interfaceC43172j;
                this.f161129q = 1;
                objA = interfaceC39580a.a(this.f161132t, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f161130r;
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            aVar.getClass();
            if (typedResult instanceof TypedResult.Success) {
                C40003a c40003a = (C40003a) ((TypedResult.Success) typedResult).getResult();
                String title = c40003a.getTitle();
                String description = c40003a.getDescription();
                C40004b materials = c40003a.getMaterials();
                if (materials == null || (listA = materials.a()) == null) {
                    arrayList = C42784z0.f406748b;
                } else {
                    List<Material> list = listA;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    for (Material material : list) {
                        String title2 = material.getTitle();
                        Material.Icon icon = material.getIcon();
                        Material.Icon icon2 = Material.Icon.ExternalFile;
                        if (icon == icon2) {
                            i12 = R.drawable.gig_tutorials_file;
                        } else {
                            com.akita.compose.theme.re23.b.f63983a.getClass();
                            com.akita.compose.theme.re23.b.f63985c.getClass();
                            i12 = e.f64007Aa;
                        }
                        Material.Icon icon3 = material.getIcon();
                        String url = material.getUrl();
                        arrayList.add(new NH.a(i12, icon3 == icon2 ? new InAppBrowserLink(Uri.parse(url)) : new WebViewLink.AnyDomain(Uri.parse(url), null, null, 6, null), title2));
                    }
                }
                contentLoaded = new GigTutorialsInternalAction.ContentLoaded(title, description, arrayList);
            } else {
                contentLoaded = GigTutorialsInternalAction.Error.f161152b;
            }
            this.f161130r = null;
            this.f161129q = 2;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC39580a interfaceC39580a) {
        this.f161128a = interfaceC39580a;
    }

    @k
    public final InterfaceC43160i<GigTutorialsInternalAction> a(long j12) {
        return C43175k.G(new C4715a(j12, null));
    }
}
