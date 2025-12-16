package com.tbruyelle.rxpermissions3;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.tbruyelle.rxpermissions3.m;

/* compiled from: RxPermissions.java */
/* loaded from: classes7.dex */
class h implements m.a<RxPermissionsFragment> {

    /* renamed from: a, reason: collision with root package name */
    public RxPermissionsFragment f366511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f366512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f366513c;

    public h(m mVar, FragmentManager fragmentManager) {
        this.f366513c = mVar;
        this.f366512b = fragmentManager;
    }

    public final RxPermissionsFragment a() {
        RxPermissionsFragment rxPermissionsFragment;
        synchronized (this) {
            try {
                if (this.f366511a == null) {
                    m mVar = this.f366513c;
                    FragmentManager fragmentManager = this.f366512b;
                    mVar.getClass();
                    RxPermissionsFragment rxPermissionsFragment2 = (RxPermissionsFragment) fragmentManager.H("m");
                    if (rxPermissionsFragment2 == null) {
                        rxPermissionsFragment2 = new RxPermissionsFragment();
                        H hE2 = fragmentManager.e();
                        hE2.j(0, rxPermissionsFragment2, "m", 1);
                        hE2.g();
                    }
                    this.f366511a = rxPermissionsFragment2;
                }
                rxPermissionsFragment = this.f366511a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rxPermissionsFragment;
    }
}
