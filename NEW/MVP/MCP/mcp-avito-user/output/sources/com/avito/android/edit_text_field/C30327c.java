package com.avito.android.edit_text_field;

import android.os.Bundle;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_text_field.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30327c extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f146941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f146942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f146943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f146944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30327c(String str, String str2, String str3, String str4) {
        super(1);
        this.f146941l = str;
        this.f146942m = str2;
        this.f146943n = str3;
        this.f146944o = str4;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("key_mode", new EditTextFieldFragment.Mode.Basic(this.f146941l, this.f146942m, this.f146943n, this.f146944o, "basic_edit_text_field_result_key"));
        return G0.f406611a;
    }
}
