package kb1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class j implements ru.rustore.sdk.core.tasks.e, ru.rustore.sdk.core.tasks.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f406459b;

    @Override // ru.rustore.sdk.core.tasks.d
    public void a(Throwable th2) {
        this.f406459b.f406442e.info("Re-subscription is completed with exception " + th2.getMessage());
    }

    @Override // ru.rustore.sdk.core.tasks.e
    public void onSuccess(Object obj) {
        this.f406459b.f406442e.info("Re-subscription result is Success!");
    }
}
