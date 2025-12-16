package shark.internal;

import kotlin.Metadata;
import shark.N2;
import shark.i3;
import shark.internal.AndroidReferenceReaders;
import shark.internal.C0;

/* compiled from: AndroidReferenceReaders.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48267b implements C0.a.InterfaceC12630a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidReferenceReaders.a.C12629a f438492a;

    public C48267b(AndroidReferenceReaders.a.C12629a c12629a) {
        this.f438492a = c12629a;
    }

    @Override // shark.internal.C0.a.InterfaceC12630a
    @Y61.k
    public final C0.a a() {
        return new C0.a("mNewActivities", this.f438492a.f438300b, ReferenceLocationType.f438449b, new N2(new i3.b("android.app.ActivityThread", "mNewActivities"), "New activities are leaked by ActivityThread until the main thread becomes idle.\nTracked here: https://issuetracker.google.com/issues/258390457", null, 4, null));
    }
}
