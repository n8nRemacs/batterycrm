package com.avito.android.extended_profile_phone_dialog;

import android.content.ClipboardManager;
import android.content.Context;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.util.S;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfilePhoneDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f151557H = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ClipboardManager f151558E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final S f151559F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f151560G;

    public b(@Y61.k Context context, @Y61.k ClipboardManager clipboardManager, @Y61.k S s5) {
        super(context, 0, 2, null);
        this.f151558E = clipboardManager;
        this.f151559F = s5;
        D(R.layout.extended_profile_phone_dialog, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, context.getString(R.string.phone_dialog_title), true, true, 2);
        this.f151560G = (LinearLayout) findViewById(R.id.extended_profile_phones_container);
    }
}
