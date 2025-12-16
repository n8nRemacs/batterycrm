package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.C36467f;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.D;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: BeanDescription.java */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final h f341454a;

    public b(h hVar) {
        this.f341454a = hVar;
    }

    public abstract AbstractC36471j a();

    public abstract AbstractC36471j b();

    public abstract ArrayList c();

    public abstract C36467f d();

    public abstract Class<?>[] e();

    public abstract JsonFormat.b f();

    public abstract Map<Object, AbstractC36471j> g();

    public abstract AbstractC36471j h();

    public abstract C36472k i(String str, Class<?>[] clsArr);

    public abstract List<com.fasterxml.jackson.databind.introspect.u> j();

    public abstract JsonInclude.a k(JsonInclude.a aVar);

    public abstract InterfaceC36495a l();

    public abstract C36465d m();

    public abstract List<C36467f> n();

    public abstract List<C36472k> o();

    public abstract Set<String> p();

    public abstract D q();

    public abstract boolean r();

    public abstract Object s(boolean z12);
}
