package com.avito.android.advert.item.realty_usp;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35864o5;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: RealtyUspPrefsStorage.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/d;", "Lcom/avito/android/advert/item/realty_usp/c;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f78397a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f78398b;

    /* compiled from: RealtyUspPrefsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/d$a;", "", "<init>", "()V", "", "USER_ID_KEY", "Ljava/lang/String;", "VISITED_IDS_KEY", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyUspPrefsStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroid/content/SharedPreferences$Editor;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.realty_usp.RealtyUspPrefsStorageImpl$clearPrefs$2", f = "RealtyUspPrefsStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super SharedPreferences.Editor>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super SharedPreferences.Editor> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            SharedPreferences.Editor editorEdit = d.this.f78397a.getF316a().edit();
            editorEdit.remove("bx_realty_usp_visited_ids");
            editorEdit.commit();
            return editorEdit;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k AK0.l lVar, @Y61.k R0 r02) {
        this.f78397a = lVar;
        this.f78398b = r02;
    }

    @Override // com.avito.android.advert.item.realty_usp.c
    @Y61.l
    public final Object a(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        Object objB = C35864o5.b(this.f78397a.getF316a(), "bx_realty_usp_user_id", str, this.f78398b.a(), (ContinuationImpl) continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }

    @Override // com.avito.android.advert.item.realty_usp.c
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f78398b.a(), new b(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.advert.item.realty_usp.c
    @Y61.l
    public final Object c(@Y61.k Continuation<? super String> continuation) {
        return C35864o5.a(this.f78397a.getF316a(), "bx_realty_usp_user_id", this.f78398b.a(), (SuspendLambda) continuation);
    }

    @Override // com.avito.android.advert.item.realty_usp.c
    @Y61.l
    public final Set d() {
        Set<String> setF = this.f78397a.f("bx_realty_usp_visited_ids");
        if (setF == null) {
            setF = B0.f406639b;
        }
        return setF;
    }

    @Override // com.avito.android.advert.item.realty_usp.c
    @Y61.l
    public final G0 e(@Y61.k String str) {
        AK0.l lVar = this.f78397a;
        Set<String> setF = lVar.f("bx_realty_usp_visited_ids");
        if (setF == null) {
            setF = B0.f406639b;
        }
        lVar.putStringSet("bx_realty_usp_visited_ids", b1.i(setF, str));
        return G0.f406611a;
    }
}
