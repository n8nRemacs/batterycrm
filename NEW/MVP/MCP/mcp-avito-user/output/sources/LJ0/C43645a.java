package lJ0;

import AK0.l;
import Y61.k;
import android.content.SharedPreferences;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kJ0.C42588a;
import kotlin.Metadata;

/* compiled from: PrefSafetyInfoSessionStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlJ0/a;", "LlJ0/d;", "_avito_user-adverts-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lJ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43645a implements InterfaceC43648d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f413696a;

    @Inject
    public C43645a(@k l lVar) {
        this.f413696a = lVar;
    }

    @Override // lJ0.InterfaceC43648d
    public final void a(@k com.avito.android.user_adverts_common.safety.a aVar, @k String str) {
        SharedPreferences.Editor editorEdit = this.f413696a.getF316a().edit();
        StringBuilder sb2 = new StringBuilder();
        C42588a.f406227a.getClass();
        editorEdit.putLong(AK.c.s(sb2, C42588a.f406228b, str), aVar.f315915a).apply();
    }

    @Override // lJ0.InterfaceC43648d
    @k
    public final com.avito.android.user_adverts_common.safety.a b(@k String str) {
        SharedPreferences f316a = this.f413696a.getF316a();
        StringBuilder sb2 = new StringBuilder();
        C42588a.f406227a.getClass();
        return new com.avito.android.user_adverts_common.safety.a(f316a.getLong(AK.c.s(sb2, C42588a.f406228b, str), 0L));
    }
}
