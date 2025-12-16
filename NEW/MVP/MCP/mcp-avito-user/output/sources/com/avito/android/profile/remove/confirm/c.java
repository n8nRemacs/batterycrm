package com.avito.android.profile.remove.confirm;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.o;
import com.avito.android.util.I5;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: ProfileRemoveConfirmDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/confirm/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f223807N = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final ProfileRemoveConfirmDialogParams f223808E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f223809F;

    /* renamed from: G, reason: collision with root package name */
    @Inject
    public h f223810G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public ProfileRemoveAnalytics f223811H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public R0 f223812I;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public com.avito.android.remote.error.f f223813J;

    /* renamed from: K, reason: collision with root package name */
    @Inject
    public o f223814K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C43238h f223815L;

    /* renamed from: M, reason: collision with root package name */
    public Button f223816M;

    /* compiled from: ProfileRemoveConfirmDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = ((c) this.receiver).f223808E;
            if (profileRemoveConfirmDialogParams != null) {
                ((TextView) view2.findViewById(R.id.title)).setText(profileRemoveConfirmDialogParams.f223781b);
                I5.a((TextView) view2.findViewById(R.id.description), profileRemoveConfirmDialogParams.f223782c, false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveConfirmDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            c cVar = (c) this.receiver;
            int i12 = c.f223807N;
            cVar.getClass();
            Button button = (Button) view.findViewById(R.id.confirm_button);
            cVar.f223816M = button;
            ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = cVar.f223808E;
            if (profileRemoveConfirmDialogParams != null) {
                button.setText(profileRemoveConfirmDialogParams.f223783d);
            }
            Button button2 = cVar.f223816M;
            if (button2 == null) {
                button2 = null;
            }
            button2.setOnClickListener(new com.avito.android.profile.remove.confirm.a(cVar, 0));
            return G0.f406611a;
        }
    }

    public /* synthetic */ c(Context context, com.avito.android.profile.remove.di.b bVar, ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams, Y41.a aVar, int i12, C42822w c42822w) {
        this(context, bVar, profileRemoveConfirmDialogParams, (i12 & 8) != 0 ? null : aVar);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ProfileRemoveAnalytics profileRemoveAnalytics = this.f223811H;
        if (profileRemoveAnalytics == null) {
            profileRemoveAnalytics = null;
        }
        String strA = profileRemoveAnalytics.f223772b.a();
        if (strA == null) {
            return;
        }
        profileRemoveAnalytics.f223771a.c(new I90.a(strA));
    }

    public c(@Y61.k Context context, @Y61.k com.avito.android.profile.remove.di.b bVar, @Y61.l ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams, @Y61.l Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f223808E = profileRemoveConfirmDialogParams;
        this.f223809F = aVar;
        B(R.layout.profile_remove_dialog_body, R.layout.profile_remove_dialog_footer, new a(1, this, c.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0), new b(1, this, c.class, "setupFooterView", "setupFooterView(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 2);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
        bVar.T9(this);
        R0 r02 = this.f223812I;
        this.f223815L = U.a((r02 != null ? r02 : null).b());
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.profile.remove.confirm.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                U.b(this.f223806b.f223815L, null);
            }
        });
    }
}
