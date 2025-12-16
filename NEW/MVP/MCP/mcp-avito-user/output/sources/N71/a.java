package N71;

import h81.InterfaceC40782a;
import h81.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import l81.g;
import org.mockito.mock.SerializableMode;

/* compiled from: CreationSettings.java */
/* loaded from: classes7.dex */
public class a<T> implements InterfaceC40782a<T>, Serializable {
    private static final long serialVersionUID = -6789800638070123629L;

    /* renamed from: b, reason: collision with root package name */
    public Class<T> f11211b;

    /* renamed from: d, reason: collision with root package name */
    public g<Object> f11213d;

    /* renamed from: e, reason: collision with root package name */
    public Y71.g f11214e;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11219j;

    /* renamed from: k, reason: collision with root package name */
    public Object f11220k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f11221l;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f11212c = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public SerializableMode f11215f = SerializableMode.f421782b;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f11216g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public CopyOnWriteArrayList f11217h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public LinkedList f11218i = new LinkedList();

    @Override // h81.InterfaceC40782a
    public b a() {
        return this.f11214e;
    }

    @Override // h81.InterfaceC40782a
    public final boolean b() {
        return this.f11215f != SerializableMode.f421782b;
    }

    @Override // h81.InterfaceC40782a
    public final SerializableMode c() {
        return this.f11215f;
    }

    @Override // h81.InterfaceC40782a
    public Class<T> d() {
        return this.f11211b;
    }
}
