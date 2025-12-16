package com.avito.android.extended_profile_ui_components;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsBottomMenu.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/d;", "", "Action", "Lcom/avito/android/extended_profile_ui_components/a;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d<Action> implements com.avito.android.extended_profile_ui_components.a<Action> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f153321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f153322b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f153323c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N f153324d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N f153325e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f153326f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public View f153327g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public TextView f153328h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public TextView f153329i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public LinearLayout f153330j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public View f153331k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Button f153332l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Button f153333m;

    /* compiled from: ActionsBottomMenu.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionsBottomMenuData.SubtitleType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionsBottomMenuData.SubtitleType subtitleType = ActionsBottomMenuData.SubtitleType.f153267b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, int i12, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.l<? super Action, G0> lVar, @Y61.k Y41.a<G0> aVar2) {
        this.f153321a = context;
        this.f153322b = i12;
        this.f153323c = aVar;
        this.f153324d = (N) lVar;
        this.f153325e = (N) aVar2;
    }

    public final void a() {
        com.avito.android.lib.design.bottom_sheet.d dVar;
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f153326f;
        if (dVar2 == null || !dVar2.isShowing() || (dVar = this.f153326f) == null) {
            return;
        }
        dVar.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.avito.android.extended_profile_ui_components.ActionsBottomMenuData<Action> r13) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_ui_components.d.b(com.avito.android.extended_profile_ui_components.ActionsBottomMenuData):void");
    }

    public final void c(@Y61.k ActionsBottomMenuData<Action> actionsBottomMenuData) {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f153326f;
        if (dVar != null && dVar.isShowing()) {
            b(actionsBottomMenuData);
            return;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f153326f;
        if (dVar2 != null) {
            dVar2.dismiss();
        }
        com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(this.f153321a, 0, 2, null);
        dVar3.setContentView(R.layout.actions_menu);
        dVar3.S(C35835l0.g(dVar3.getContext()).y);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar3, null, false, true, 7);
        this.f153327g = dVar3.findViewById(R.id.extended_profile_actions_menu_container);
        this.f153328h = (TextView) dVar3.findViewById(R.id.extended_profile_actions_menu_title);
        this.f153329i = (TextView) dVar3.findViewById(R.id.extended_profile_actions_menu_subtitle);
        this.f153330j = (LinearLayout) dVar3.findViewById(R.id.extended_profile_actions_menu_actions);
        this.f153331k = dVar3.findViewById(R.id.extended_profile_actions_menu_bottom_container);
        this.f153332l = (Button) dVar3.findViewById(R.id.extended_profile_actions_menu_bottom_primary_button);
        this.f153333m = (Button) dVar3.findViewById(R.id.extended_profile_actions_menu_bottom_secondary_button);
        dVar3.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 17));
        com.avito.android.lib.util.g.a(dVar3);
        this.f153326f = dVar3;
        b(actionsBottomMenuData);
    }
}
