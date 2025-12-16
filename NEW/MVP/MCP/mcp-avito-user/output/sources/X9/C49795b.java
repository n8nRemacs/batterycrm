package x9;

import Y61.k;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.res.i;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EquipmentsResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx9/b;", "Lx9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x9.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49795b implements InterfaceC49794a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f442266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442268c;

    /* renamed from: d, reason: collision with root package name */
    public final int f442269d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f442270e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f442271f;

    @Inject
    public C49795b(@k Resources resources) {
        this.f442266a = resources;
        this.f442267b = resources.getDimensionPixelSize(R.dimen.equipments_dialog_option_text_offset);
        this.f442268c = resources.getDimensionPixelSize(R.dimen.equipments_dialog_option_block_offset);
        this.f442269d = resources.getDimensionPixelSize(R.dimen.equipments_dialog_list_bottom_offset);
        this.f442270e = resources.getString(R.string.advert_core_equipments_link_text);
        this.f442271f = resources.getString(R.string.advert_core_equipments_dialog_button_text);
    }

    @Override // x9.InterfaceC49794a
    public final int a() {
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return this.f442266a.getColor(R.color.legacy_gray_54, null);
    }

    @Override // x9.InterfaceC49794a
    /* renamed from: b, reason: from getter */
    public final int getF442269d() {
        return this.f442269d;
    }

    @Override // x9.InterfaceC49794a
    @k
    /* renamed from: c, reason: from getter */
    public final String getF442271f() {
        return this.f442271f;
    }

    @Override // x9.InterfaceC49794a
    @k
    /* renamed from: d, reason: from getter */
    public final String getF442270e() {
        return this.f442270e;
    }

    @Override // x9.InterfaceC49794a
    public final int e() {
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return this.f442266a.getColor(R.color.legacy_gray_48, null);
    }

    @Override // x9.InterfaceC49794a
    public final int f() {
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return this.f442266a.getColor(R.color.legacy_black, null);
    }

    @Override // x9.InterfaceC49794a
    /* renamed from: g, reason: from getter */
    public final int getF442267b() {
        return this.f442267b;
    }

    @Override // x9.InterfaceC49794a
    /* renamed from: h, reason: from getter */
    public final int getF442268c() {
        return this.f442268c;
    }
}
