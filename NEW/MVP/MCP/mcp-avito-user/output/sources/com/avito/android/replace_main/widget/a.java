package com.avito.android.replace_main.widget;

import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import ym0.InterfaceC50270b;

/* compiled from: ReplaceMainPublicFeaturesImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/widget/a;", "Lym0/b;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC50270b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final W20.f f254666a;

    @Inject
    public a(@Y61.k W20.f fVar) {
        this.f254666a = fVar;
    }

    @Override // ym0.InterfaceC50270b
    public final boolean a() {
        W20.f fVar = this.f254666a;
        if (fVar.f()) {
            W20.a aVar = fVar.f17729a;
            aVar.getClass();
            n<Object> nVar = W20.a.f17716j[6];
            if (((Boolean) aVar.f17723h.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
