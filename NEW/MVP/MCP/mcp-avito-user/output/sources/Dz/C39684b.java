package dZ;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoPersistHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"LdZ/b;", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dZ.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39684b implements InterfaceC39683a<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f393908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f393909b;

    public C39684b(String str, Map map) {
        this.f393908a = str;
        this.f393909b = map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // dZ.InterfaceC39683a
    @l
    public final Object a(@k h hVar) {
        InterfaceC39683a interfaceC39683a = (InterfaceC39683a) this.f393909b.get(Integer.valueOf(hVar.a(this.f393908a)));
        if (interfaceC39683a == null) {
            return null;
        }
        return interfaceC39683a.a(hVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // dZ.InterfaceC39683a
    public final void b(@k i iVar, Object obj) {
        iVar.a(1, this.f393908a);
        InterfaceC39683a interfaceC39683a = (InterfaceC39683a) this.f393909b.get(1);
        if (interfaceC39683a == null) {
            return;
        }
        interfaceC39683a.b(iVar, obj);
    }
}
