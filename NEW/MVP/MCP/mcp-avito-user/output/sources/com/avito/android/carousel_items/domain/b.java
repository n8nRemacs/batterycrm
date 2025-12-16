package com.avito.android.carousel_items.domain;

import android.os.Parcelable;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f115267b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f115270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Parcelable f115271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f115272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f115273h;

    public /* synthetic */ b(e eVar, ItemsRequestParams.ParamRecs paramRecs, String str, Location location, String str2, Integer num) {
        this.f115270e = eVar;
        this.f115271f = paramRecs;
        this.f115268c = str;
        this.f115272g = location;
        this.f115269d = str2;
        this.f115273h = num;
    }

    @Override // l41.s
    public final Object get() {
        switch (this.f115267b) {
            case 0:
                V0 v02 = ((e) this.f115270e).f115277a.get();
                ItemsRequestParams.ParamRecs paramRecs = (ItemsRequestParams.ParamRecs) this.f115271f;
                int limit = paramRecs.getLimit();
                int minItems = paramRecs.getMinItems();
                String itemsType = paramRecs.getItemsType();
                String displayType = paramRecs.getDisplayType();
                Location location = (Location) this.f115272g;
                return v02.u(limit, minItems, itemsType, displayType, this.f115268c, location != null ? location.getId() : null, this.f115269d, location != null ? Boolean.valueOf(location.getForcedByUser()) : null, (Integer) this.f115273h, 0);
            default:
                com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.b bVar = (com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.b) this.f115270e;
                return bVar.f168439a.get().b(this.f115268c, this.f115269d, (String) this.f115272g, ((IacCallContext) this.f115271f).f166824b, bVar.f168445g.a(), Boolean.valueOf(bVar.f168444f.b("android.permission.RECORD_AUDIO")), (Boolean) this.f115273h, null);
        }
    }

    public /* synthetic */ b(com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.b bVar, IacCallContext iacCallContext, String str, String str2, String str3, Boolean bool) {
        this.f115270e = bVar;
        this.f115271f = iacCallContext;
        this.f115268c = str;
        this.f115269d = str2;
        this.f115272g = str3;
        this.f115273h = bool;
    }
}
