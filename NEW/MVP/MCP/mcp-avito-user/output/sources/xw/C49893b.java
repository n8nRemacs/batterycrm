package xW;

import com.avito.android.job_assistant_pick_location.deeplink.JobAssistantPickLocationLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import wW.C49568b;
import wW.C49569c;

/* compiled from: JobAssistantPickLocationHandlerModule_ProvideDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: xW.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49893b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C49568b f442519a;

    public C49893b(C49568b c49568b) {
        this.f442519a = c49568b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49568b c49568b = this.f442519a;
        C49892a.f442518a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(JobAssistantPickLocationLink.class, new C49569c(), new C43834a.b.C11809b(c49568b));
    }
}
