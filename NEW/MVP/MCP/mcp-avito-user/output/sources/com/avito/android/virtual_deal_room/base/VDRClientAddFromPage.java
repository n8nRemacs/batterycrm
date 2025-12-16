package com.avito.android.virtual_deal_room.base;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VDRClientAddResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/base/VDRClientAddFromPage;", "", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VDRClientAddFromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final VDRClientAddFromPage f326100c;

    /* renamed from: d, reason: collision with root package name */
    public static final VDRClientAddFromPage f326101d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VDRClientAddFromPage[] f326102e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f326103f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326104b;

    static {
        VDRClientAddFromPage vDRClientAddFromPage = new VDRClientAddFromPage("NewClientCreationND", 0, "new_client_creation_nd");
        VDRClientAddFromPage vDRClientAddFromPage2 = new VDRClientAddFromPage("NewClientCreationPP", 1, "new_client_creation_pp");
        VDRClientAddFromPage vDRClientAddFromPage3 = new VDRClientAddFromPage("NewClientCreationMort", 2, "new_client_creation_mort");
        f326100c = vDRClientAddFromPage3;
        VDRClientAddFromPage vDRClientAddFromPage4 = new VDRClientAddFromPage("Demo", 3, "new_client_creation_example");
        f326101d = vDRClientAddFromPage4;
        VDRClientAddFromPage[] vDRClientAddFromPageArr = {vDRClientAddFromPage, vDRClientAddFromPage2, vDRClientAddFromPage3, vDRClientAddFromPage4};
        f326102e = vDRClientAddFromPageArr;
        f326103f = c.a(vDRClientAddFromPageArr);
    }

    public VDRClientAddFromPage(String str, int i12, String str2) {
        this.f326104b = str2;
    }

    public static VDRClientAddFromPage valueOf(String str) {
        return (VDRClientAddFromPage) Enum.valueOf(VDRClientAddFromPage.class, str);
    }

    public static VDRClientAddFromPage[] values() {
        return (VDRClientAddFromPage[]) f326102e.clone();
    }
}
