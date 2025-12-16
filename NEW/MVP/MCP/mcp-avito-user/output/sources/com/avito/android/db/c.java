package com.avito.android.db;

import android.content.ContentValues;
import kotlin.Metadata;

/* compiled from: ContentValuePropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/db/c;", "T", "Lkotlin/properties/h;", "", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c<T> implements kotlin.properties.h<Object, T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentValues f132679b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f132680c;

    public c(@Y61.k ContentValues contentValues, @Y61.k String str) {
        this.f132679b = contentValues;
        this.f132680c = str;
    }

    @Override // kotlin.properties.g
    @Y61.l
    public final T getValue(@Y61.k Object obj, @Y61.k kotlin.reflect.n<?> nVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.h
    public final void setValue(@Y61.k Object obj, @Y61.k kotlin.reflect.n<?> nVar, @Y61.l T t12) {
        String str = this.f132680c;
        ContentValues contentValues = this.f132679b;
        if (t12 == 0) {
            contentValues.putNull(str);
            return;
        }
        if (t12 instanceof String) {
            contentValues.put(str, (String) t12);
            return;
        }
        if (t12 instanceof Long) {
            contentValues.put(str, (Long) t12);
            return;
        }
        if (t12 instanceof Integer) {
            contentValues.put(str, (Integer) t12);
            return;
        }
        if (t12 instanceof Boolean) {
            contentValues.put(str, (Boolean) t12);
            return;
        }
        if (t12 instanceof byte[]) {
            contentValues.put(str, (byte[]) t12);
            return;
        }
        if (t12 instanceof Double) {
            contentValues.put(str, (Double) t12);
            return;
        }
        if (t12 instanceof Float) {
            contentValues.put(str, (Float) t12);
            return;
        }
        if (t12 instanceof Short) {
            contentValues.put(str, (Short) t12);
            return;
        }
        if (t12 instanceof Byte) {
            contentValues.put(str, (Byte) t12);
            return;
        }
        throw new IllegalArgumentException("ContentValue doesn't support the value " + t12 + " (property " + nVar.getName());
    }
}
