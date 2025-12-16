package com.avito.android.extended_profile_phone_dialog.deep_linking;

import Y61.k;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ExtendedProfilePhoneMappingsModule_ProvideProfileSettingsLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/c;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f151564b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f151565a;

    /* compiled from: ExtendedProfilePhoneMappingsModule_ProvideProfileSettingsLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/c$a;", "", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k b bVar, @k f fVar) {
        this.f151565a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f151565a;
        f151564b.getClass();
        return new C43834a(ExtendedProfilePhoneRequestLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ExtendedProfilePhoneRequestLink.class), fVar));
    }
}
