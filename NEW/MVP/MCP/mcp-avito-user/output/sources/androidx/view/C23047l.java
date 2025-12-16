package androidx.view;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutineLiveData.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_release", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23047l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C23051n f46814q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f46815r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C23051n<Object> f46816s;

    /* renamed from: t, reason: collision with root package name */
    public int f46817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23047l(C23051n c23051n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f46816s = c23051n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f46815r = obj;
        this.f46817t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f46816s.c(this);
    }
}
