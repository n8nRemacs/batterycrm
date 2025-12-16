package com.avito.android.theme_settings.viewmodel;

import Y61.k;
import com.avito.android.lib.util.darkTheme.a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.serp.adapter.i1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nE0.InterfaceC44242a;

/* compiled from: ThemeSettingsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/viewmodel/c;", "Lcom/avito/android/theme_settings/viewmodel/b;", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44242a f301369a;

    /* compiled from: ThemeSettingsConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/theme_settings/viewmodel/c$a;", "", "<init>", "()V", "", "ID_BATTTERY", "Ljava/lang/String;", "ID_DARK", "ID_LIGHT", "ID_SYSTEM", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k InterfaceC44242a interfaceC44242a) {
        this.f301369a = interfaceC44242a;
    }

    @Override // com.avito.android.theme_settings.viewmodel.b
    @k
    public final i1 a(@k com.avito.android.theme_settings.viewmodel.a aVar) {
        a.AbstractC5328a.d dVar = a.AbstractC5328a.d.f181344b;
        a.AbstractC5328a abstractC5328a = aVar.f301367a;
        boolean zF2 = L.f(abstractC5328a, dVar);
        InterfaceC44242a interfaceC44242a = this.f301369a;
        if (zF2) {
            return new com.avito.android.theme_settings.item.theme_checkmark.a(FontStyleKt.LIGHT, interfaceC44242a.getF414954g(), interfaceC44242a.getF414953f(), aVar);
        }
        if (L.f(abstractC5328a, a.AbstractC5328a.b.f181342b)) {
            return new com.avito.android.theme_settings.item.theme_checkmark.a("dark", interfaceC44242a.getF414952e(), interfaceC44242a.getF414951d(), aVar);
        }
        if (L.f(abstractC5328a, a.AbstractC5328a.C5329a.f181341b)) {
            return new com.avito.android.theme_settings.item.switcher.a("battery", interfaceC44242a.getF414950c(), interfaceC44242a.h(), aVar);
        }
        if (L.f(abstractC5328a, a.AbstractC5328a.c.f181343b)) {
            return new com.avito.android.theme_settings.item.switcher.a(ChannelContext.System.TYPE, interfaceC44242a.d(), interfaceC44242a.c(), aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
