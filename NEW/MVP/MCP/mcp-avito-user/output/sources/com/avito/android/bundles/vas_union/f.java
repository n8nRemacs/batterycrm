package com.avito.android.bundles.vas_union;

import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xZ.C49899a;

/* compiled from: VasUnionFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasUnionFragment f108558l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VasUnionFragment vasUnionFragment) {
        super(1);
        this.f108558l = vasUnionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        VasUnionFragment vasUnionFragment = this.f108558l;
        Button button = vasUnionFragment.f108465u0;
        if (button == null) {
            button = null;
        }
        com.avito.android.lib.design.button.b.a(button, str2, true);
        RecyclerView recyclerViewQ5 = vasUnionFragment.q5();
        InterfaceC42726C interfaceC42726C = vasUnionFragment.f108467w0;
        recyclerViewQ5.r0((C49899a) interfaceC42726C.getValue());
        if (str2 != null && str2.length() != 0) {
            vasUnionFragment.q5().l((C49899a) interfaceC42726C.getValue(), -1);
        }
        return G0.f406611a;
    }
}
