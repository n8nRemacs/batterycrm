package N91;

import B91.v;
import android.widget.TextView;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class p implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u f11283b;

    public p(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar) {
        this.f11283b = uVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u uVar = this.f11283b;
        v vVar = (v) uVar.f436376g0;
        TextView textView = vVar != null ? vVar.f1183f : null;
        if (textView != null) {
            textView.setVisibility(list.isEmpty() ? 0 : 8);
        }
        uVar.f436434h0.m(C42745f0.B0(list, new o()));
        return G0.f406611a;
    }
}
