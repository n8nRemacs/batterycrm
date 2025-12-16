package com.yandex.metrica.impl.ob;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39205w implements InterfaceC38941l2 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Integer> f382085a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f382086b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private volatile a f382087c = a.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    private final Set<b> f382088d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.w$a */
    public enum a {
        UNKNOWN("unknown"),
        BACKGROUND(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND),
        VISIBLE("visible");

        a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w$b */
    public interface b {
        void a(@j.N a aVar);
    }

    private void d() {
        a aVar = a.UNKNOWN;
        if (!this.f382085a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f382086b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f382087c != aVar) {
            this.f382087c = aVar;
            Iterator<b> it = this.f382088d.iterator();
            while (it.hasNext()) {
                it.next().a(this.f382087c);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void a() {
        d();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void b() {
        if (this.f382087c == a.VISIBLE) {
            this.f382087c = a.BACKGROUND;
        }
    }

    @j.N
    public a c() {
        return this.f382087c;
    }

    @j.N
    public a a(@j.P b bVar) {
        this.f382088d.add(bVar);
        return this.f382087c;
    }

    public void c(int i12) {
        this.f382085a.add(Integer.valueOf(i12));
        this.f382086b.remove(Integer.valueOf(i12));
        d();
    }

    public void b(int i12) {
        this.f382086b.add(Integer.valueOf(i12));
        this.f382085a.remove(Integer.valueOf(i12));
        d();
    }

    public void a(int i12) {
        this.f382085a.remove(Integer.valueOf(i12));
        d();
    }
}
