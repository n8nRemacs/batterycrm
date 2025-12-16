package com.avito.android.authorization.gorelkin;

import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.deep_linking.links.x;
import com.avito.android.help_center.InterfaceC30751h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParsingPermissionFragment f93893c;

    public /* synthetic */ a(ParsingPermissionFragment parsingPermissionFragment, int i12) {
        this.f93892b = i12;
        this.f93893c = parsingPermissionFragment;
    }

    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(String str) {
        ParsingPermissionFragment parsingPermissionFragment = this.f93893c;
        switch (this.f93892b) {
            case 0:
                ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                if (str.equals("full_attribute")) {
                    InterfaceC30751h interfaceC30751h = parsingPermissionFragment.f93874p0;
                    parsingPermissionFragment.startActivity((interfaceC30751h != null ? interfaceC30751h : null).a("articles/2334"));
                    break;
                }
                break;
            default:
                ParsingPermissionFragment.a aVar2 = ParsingPermissionFragment.f93867D0;
                if (str.equals("full_attribute")) {
                    InterfaceC30751h interfaceC30751h2 = parsingPermissionFragment.f93874p0;
                    parsingPermissionFragment.startActivity((interfaceC30751h2 != null ? interfaceC30751h2 : null).a("articles/2333"));
                    break;
                }
                break;
        }
        return true;
    }
}
