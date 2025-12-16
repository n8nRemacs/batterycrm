package com.avito.android.publish.drafts.di;

import Zd0.C19544b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.work.PublishDraftsSyncWorker;
import com.avito.android.publish.drafts.PublishDraftAvailableDialog;
import com.avito.android.publish.drafts.di.c;
import com.google.gson.Gson;
import dagger.internal.t;
import yc.C50213a;

/* compiled from: DaggerPublishDraftAvailableDialogComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: DaggerPublishDraftAvailableDialogComponent.java */
    /* renamed from: com.avito.android.publish.drafts.di.b$b, reason: collision with other inner class name */
    public static final class C7095b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public f f235339a;

        public C7095b() {
        }

        @Override // com.avito.android.publish.drafts.di.c.a
        public final c.a a(f fVar) {
            this.f235339a = fVar;
            return this;
        }

        @Override // com.avito.android.publish.drafts.di.c.a
        public final com.avito.android.publish.drafts.di.c build() {
            t.a(f.class, this.f235339a);
            return new c(this.f235339a, null);
        }
    }

    /* compiled from: DaggerPublishDraftAvailableDialogComponent.java */
    public static final class c implements com.avito.android.publish.drafts.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final f f235340a;

        public c(f fVar, a aVar) {
            this.f235340a = fVar;
        }

        @Override // com.avito.android.publish.drafts.di.c
        public final void a(PublishDraftsSyncWorker publishDraftsSyncWorker) {
            publishDraftsSyncWorker.f91748a = this.f235340a.Mb();
        }

        @Override // com.avito.android.publish.drafts.di.c
        public final void b(PublishDraftAvailableDialog publishDraftAvailableDialog) {
            f fVar = this.f235340a;
            InterfaceC28373a interfaceC28373aA = fVar.a();
            t.c(interfaceC28373aA);
            C50213a c50213aD1 = fVar.D1();
            t.c(c50213aD1);
            Gson gsonHd = fVar.Hd();
            int i12 = d.f235341a;
            publishDraftAvailableDialog.f235329j0 = new C19544b(interfaceC28373aA, c50213aD1, gsonHd);
        }
    }

    public static c.a a() {
        return new C7095b();
    }
}
