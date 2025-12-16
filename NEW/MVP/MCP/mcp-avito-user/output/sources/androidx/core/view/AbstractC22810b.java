package androidx.core.view;

import android.view.View;
import androidx.annotation.RestrictTo;

/* compiled from: ActionProvider.java */
/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22810b {

    /* renamed from: a, reason: collision with root package name */
    public a f45026a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1755b f45027b;

    /* compiled from: ActionProvider.java */
    @RestrictTo
    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC1755b {
    }

    public boolean a() {
        return this instanceof androidx.appcompat.widget.v0;
    }

    public boolean b() {
        return true;
    }

    @j.N
    public abstract View c();

    @j.N
    public View d(@j.N androidx.appcompat.view.menu.k kVar) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(@j.P InterfaceC1755b interfaceC1755b) {
        this.f45027b = interfaceC1755b;
    }

    public void f(@j.N androidx.appcompat.view.menu.t tVar) {
    }
}
