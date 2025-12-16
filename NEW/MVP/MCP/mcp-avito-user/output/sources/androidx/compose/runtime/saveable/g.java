package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.C;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/runtime/y1;", VoiceInfo.STATE, "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/runtime/y1;)Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g extends N implements Y41.p<x, InterfaceC22204y1<Object>, InterfaceC22204y1<Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f38566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar) {
        super(2);
        this.f38566l = wVar;
    }

    @Override // Y41.p
    public final InterfaceC22204y1<Object> invoke(x xVar, InterfaceC22204y1<Object> interfaceC22204y1) {
        x xVar2 = xVar;
        InterfaceC22204y1<Object> interfaceC22204y12 = interfaceC22204y1;
        if (!(interfaceC22204y12 instanceof C)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        Object objInvoke = this.f38566l.f38609a.invoke(xVar2, interfaceC22204y12.getF42167b());
        if (objInvoke != null) {
            return C22126m3.f(objInvoke, ((C) interfaceC22204y12).h());
        }
        return null;
    }
}
