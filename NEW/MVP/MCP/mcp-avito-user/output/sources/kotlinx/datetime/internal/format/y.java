package kotlinx.datetime.internal.format;

import kotlin.Metadata;

/* compiled from: FieldSpec.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/y;", "Object", "Field", "Lkotlinx/datetime/internal/format/b;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y<Object, Field> implements InterfaceC43370b<Object, Field> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.l<Object, Field> f412612a;

    public y(@Y61.k kotlin.reflect.l<Object, Field> lVar) {
        this.f412612a = lVar;
    }

    @Override // kotlinx.datetime.internal.format.InterfaceC43370b
    @Y61.l
    public final Field a(Object object) {
        return this.f412612a.get(object);
    }

    @Override // kotlinx.datetime.internal.format.InterfaceC43370b
    public final Field b(Object object) {
        kotlin.reflect.l<Object, Field> lVar = this.f412612a;
        Field field = lVar.get(object);
        if (field != null) {
            return field;
        }
        throw new IllegalStateException("Field " + lVar.getName() + " is not set");
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
    @Y61.l
    public final Field c(Object object, Field field) {
        kotlin.reflect.l<Object, Field> lVar = this.f412612a;
        Field field2 = lVar.get(object);
        if (field2 == null) {
            lVar.e(object, field);
        } else if (!field2.equals(field)) {
            return field2;
        }
        return null;
    }

    @Override // kotlinx.datetime.internal.format.parser.InterfaceC43375a
    @Y61.k
    public final String getName() {
        return this.f412612a.getName();
    }
}
