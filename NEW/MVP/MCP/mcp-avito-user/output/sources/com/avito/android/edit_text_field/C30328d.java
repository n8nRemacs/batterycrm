package com.avito.android.edit_text_field;

import android.os.Bundle;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditTextFieldFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_text_field.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30328d extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f146945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f146946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f146947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f146948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f146949p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f146950q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f146951r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NotSavedAlertSettings f146952s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FormattedAlertSettings f146953t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AboutPopup f146954u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30328d(String str, String str2, String str3, String str4, String str5, String str6, Integer num, NotSavedAlertSettings notSavedAlertSettings, FormattedAlertSettings formattedAlertSettings, AboutPopup aboutPopup) {
        super(1);
        this.f146945l = str;
        this.f146946m = str2;
        this.f146947n = str3;
        this.f146948o = str4;
        this.f146949p = str5;
        this.f146950q = str6;
        this.f146951r = num;
        this.f146952s = notSavedAlertSettings;
        this.f146953t = formattedAlertSettings;
        this.f146954u = aboutPopup;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f146948o;
        if (str == null) {
            str = "";
        }
        FormattedAlertSettings formattedAlertSettings = this.f146953t;
        AboutPopup aboutPopup = this.f146954u;
        bundle2.putParcelable("key_mode", new EditTextFieldFragment.Mode.Extended(this.f146945l, this.f146946m, this.f146947n, str, this.f146949p, "extended_edit_text_field_result_key", this.f146950q, this.f146951r, this.f146952s, formattedAlertSettings, aboutPopup));
        return G0.f406611a;
    }
}
