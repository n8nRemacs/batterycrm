package com.avito.android.profile_settings_extended.deep_linking;

import Y41.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import vc0.C49309h;

/* compiled from: ProfileDisableExtendedLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f230064l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f230064l = iVar;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        Context context2 = context;
        final l0.a aVar = new l0.a();
        aVar.f406838b = true;
        final com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context2, 0, 2, null);
        dVar.setContentView(R.layout.ext_profile_settings_disable_extended_menu);
        dVar.S(C35835l0.g(context2).y);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        final i iVar = this.f230064l;
        dVar.setOnDismissListener(new com.avito.android.advert.item.properties.g(9, aVar, iVar));
        ((Button) dVar.findViewById(R.id.ext_profile_disable_menu_primary_action_button)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.profile_settings_extended.deep_linking.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i iVar2 = iVar;
                iVar2.f230071j.c(new C49309h(iVar2.f230072k.a()));
                C43259k.d(iVar2.f230075n, null, null, new h(iVar2, null), 3);
                aVar.f406838b = false;
                dVar.dismiss();
            }
        });
        ((Button) dVar.findViewById(R.id.ext_profile_disable_menu_secondary_action_button)).setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(10, aVar, dVar));
        return dVar;
    }
}
