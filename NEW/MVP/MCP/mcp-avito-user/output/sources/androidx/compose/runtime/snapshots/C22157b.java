package androidx.compose.runtime.snapshots;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.runtime.snapshots.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22157b extends kotlin.jvm.internal.N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final C22157b f38693l = new C22157b();

    public C22157b() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        synchronized (C22176v.f38750c) {
            ?? r12 = C22176v.f38756i;
            int size = ((Collection) r12).size();
            for (int i12 = 0; i12 < size; i12++) {
                ((Y41.l) r12.get(i12)).invoke(obj);
            }
        }
        return G0.f406611a;
    }
}
