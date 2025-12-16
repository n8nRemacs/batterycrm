package com.avito.android.authorization.gorelkin;

import android.view.View;
import com.avito.android.R;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.m;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import qK0.C47313c;

/* compiled from: ParsingPermissionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/authorization/gorelkin/m$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<m.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParsingPermissionFragment f93898l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParsingPermissionFragment parsingPermissionFragment) {
        super(1);
        this.f93898l = parsingPermissionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(m.b bVar) {
        m.b bVar2 = bVar;
        boolean zF2 = L.f(bVar2, m.b.d.f93938a);
        ParsingPermissionFragment parsingPermissionFragment = this.f93898l;
        C47313c c47313c = parsingPermissionFragment.f93869A0;
        if (zF2) {
            kotlin.reflect.n<Object> nVar = ParsingPermissionFragment.f93868E0[9];
            D6.w((View) c47313c.a());
        } else if (L.f(bVar2, m.b.C2782b.f93935a)) {
            ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
            kotlin.reflect.n<Object> nVar2 = ParsingPermissionFragment.f93868E0[9];
            D6.H((View) c47313c.a());
        } else if (bVar2 instanceof m.b.a) {
            kotlin.reflect.n<Object>[] nVarArr = ParsingPermissionFragment.f93868E0;
            kotlin.reflect.n<Object> nVar3 = nVarArr[9];
            D6.w((View) c47313c.a());
            m.b.a aVar2 = (m.b.a) bVar2;
            String str = aVar2.f93933a;
            if (str != null) {
                C47313c c47313c2 = parsingPermissionFragment.f93878t0;
                kotlin.reflect.n<Object> nVar4 = nVarArr[2];
                ((ComponentContainer) c47313c2.a()).m(str, ComponentContainer.Condition.f178858c);
            }
            String str2 = aVar2.f93934b;
            if (str2 != null) {
                C47313c c47313c3 = parsingPermissionFragment.f93880v0;
                kotlin.reflect.n<Object> nVar5 = nVarArr[4];
                ((ComponentContainer) c47313c3.a()).m(str2, ComponentContainer.Condition.f178858c);
            }
        } else if (bVar2 instanceof m.b.c) {
            kotlin.reflect.n<Object>[] nVarArr2 = ParsingPermissionFragment.f93868E0;
            kotlin.reflect.n<Object> nVar6 = nVarArr2[9];
            D6.w((View) c47313c.a());
            m.b.c cVar = (m.b.c) bVar2;
            String string = cVar.f93936a;
            if (string == null) {
                string = parsingPermissionFragment.getString(R.string.unknown_server_error);
            }
            com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
            C47313c c47313c4 = parsingPermissionFragment.f93884z0;
            kotlin.reflect.n<Object> nVar7 = nVarArr2[8];
            com.avito.android.component.toast.c.b(cVar2, (View) c47313c4.a(), com.avito.android.printable_text.b.f(string), null, null, null, new f.c(cVar.f93937b), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}
