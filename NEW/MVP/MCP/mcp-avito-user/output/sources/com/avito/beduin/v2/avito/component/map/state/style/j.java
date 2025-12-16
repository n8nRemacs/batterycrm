package com.avito.beduin.v2.avito.component.map.state.style;

import Y41.p;
import com.avito.beduin.v2.avito.component.map.state.style.LogoAlignment;
import com.avito.beduin.v2.engine.component.G;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LogoAlignmentDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/j;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements com.avito.beduin.v2.theme.d<LogoAlignment> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f334741a = new j();

    /* compiled from: LogoAlignmentDeclaration.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "", "name", "Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Vertical;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Ljava/lang/String;)Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Vertical;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<G, String, LogoAlignment.Vertical> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f334742l = new a();

        /* compiled from: LogoAlignmentDeclaration.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.avito.component.map.state.style.j$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10375a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a<LogoAlignment.Vertical> f334743a = kotlin.enums.c.a(LogoAlignment.Vertical.values());
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final LogoAlignment.Vertical invoke(G g12, String str) {
            String string = g12.getString(str);
            Object obj = null;
            if (string == null) {
                return null;
            }
            Iterator it = ((AbstractC42738c) C10375a.f334743a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((LogoAlignment.Vertical) next).f334722b.equals(string)) {
                    obj = next;
                    break;
                }
            }
            return (LogoAlignment.Vertical) obj;
        }
    }

    /* compiled from: LogoAlignmentDeclaration.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "", "name", "Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Horizontal;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Ljava/lang/String;)Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Horizontal;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<G, String, LogoAlignment.Horizontal> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f334744l = new b();

        /* compiled from: LogoAlignmentDeclaration.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a<LogoAlignment.Horizontal> f334745a = kotlin.enums.c.a(LogoAlignment.Horizontal.values());
        }

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final LogoAlignment.Horizontal invoke(G g12, String str) {
            String string = g12.getString(str);
            Object obj = null;
            if (string == null) {
                return null;
            }
            Iterator it = ((AbstractC42738c) a.f334745a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((LogoAlignment.Horizontal) next).f334719b.equals(string)) {
                    obj = next;
                    break;
                }
            }
            return (LogoAlignment.Horizontal) obj;
        }
    }

    /* compiled from: LogoAlignmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "", "it", "", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Ljava/lang/String;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<G, String, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f334746l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(G g12, String str) {
            return g12.a(str);
        }
    }

    /* compiled from: LogoAlignmentDeclaration.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "", "it", "", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Ljava/lang/String;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<G, String, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f334747l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(G g12, String str) {
            return g12.a(str);
        }
    }

    @Y61.k
    public static LogoAlignment b(@Y61.k G g12) {
        return new LogoAlignment(com.avito.beduin.v2.theme.h.a(g12, "verticalAlignment", a.f334742l), com.avito.beduin.v2.theme.h.a(g12, "horizontalAlignment", b.f334744l), com.avito.beduin.v2.theme.h.a(g12, "verticalPadding", c.f334746l), com.avito.beduin.v2.theme.h.a(g12, "horizontalPadding", d.f334747l));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ LogoAlignment a(G g12) {
        return b(g12);
    }
}
