package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import javax.inject.Inject;
import kB.InterfaceC42561a;
import kB.InterfaceC42562b;
import kB.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalWidgetEditBlockActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LkB/a;", "LkB/b;", "LkB/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC42561a, InterfaceC42562b, kB.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditBlockArguments f154090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.a f154091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f154092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f154093d;

    @Inject
    public d(@Y61.k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments, @Y61.k com.avito.android.profile_management_core.images.a aVar) {
        this.f154090a = universalWidgetEditBlockArguments;
        this.f154091b = aVar;
        StringBuilder sb2 = new StringBuilder("universal_widget_");
        String str = universalWidgetEditBlockArguments.f153964d;
        sb2.append(str);
        sb2.append('_');
        int i12 = universalWidgetEditBlockArguments.f153963c;
        this.f154092c = AK.c.i(i12, "_first", sb2);
        this.f154093d = "universal_widget_" + str + '_' + i12 + "_second";
    }

    public static boolean c(d.a aVar) {
        Integer num;
        if (aVar == null) {
            return true;
        }
        boolean z12 = aVar.f406192h;
        String str = aVar.f406186b;
        return !((z12 && str.length() == 0) || ((num = aVar.f406188d) != null && num.intValue() < str.length()));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    @Override // com.avito.android.arch.mvi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<kB.InterfaceC42562b> b(kB.InterfaceC42561a r23, kB.d r24) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.d.b(java.lang.Object, java.lang.Object):kotlinx.coroutines.flow.i");
    }
}
