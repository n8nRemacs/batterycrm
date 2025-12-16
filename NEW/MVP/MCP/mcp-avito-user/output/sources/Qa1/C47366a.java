package qa1;

import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.base.s;

/* renamed from: qa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47366a extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.intro.b f429299l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47366a(ru.mts.biometry.sdk.feature.registration.ui.intro.b bVar) {
        super(0);
        this.f429299l = bVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        return s.valueOf(this.f429299l.requireArguments().getString("photo_source"));
    }
}
