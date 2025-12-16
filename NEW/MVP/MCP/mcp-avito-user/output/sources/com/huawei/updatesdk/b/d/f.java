package com.huawei.updatesdk.b.d;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static com.huawei.updatesdk.service.otaupdate.b f363841a;

    public static void a(com.huawei.updatesdk.service.otaupdate.b bVar) {
        f363841a = bVar;
    }

    public static void a(boolean z12) {
        com.huawei.updatesdk.b.g.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(z12 ? com.huawei.updatesdk.service.otaupdate.f.e().c() : null), new a(z12));
    }

    public static class a implements com.huawei.updatesdk.a.b.c.c.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f363842a;

        public a(boolean z12) {
            this.f363842a = z12;
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void b(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
            if (f.f363841a == null) {
                return;
            }
            if (!(dVar instanceof com.huawei.updatesdk.service.appmgr.bean.b)) {
                f.f363841a.a(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
            if (!bVar.e()) {
                f.f363841a.b(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.c cVarF = bVar.f();
            if (cVarF == null) {
                f.f363841a.a(dVar.d());
                return;
            }
            if (!this.f363842a) {
                com.huawei.updatesdk.b.e.f.a(false).a(cVarF.d());
            }
            f.f363841a.a(cVarF);
        }

        @Override // com.huawei.updatesdk.a.b.c.c.a
        public void a(com.huawei.updatesdk.a.b.c.c.c cVar, com.huawei.updatesdk.a.b.c.c.d dVar) {
        }
    }
}
