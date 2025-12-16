package com.avito.android.util.preferences.db_preferences;

import android.content.ContentValues;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.util.preferences.db_preferences.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import uu.C49113a;

/* compiled from: DbSharedPreferencesImpl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f318961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f318962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f318963n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c.a f318964o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, c cVar, c.a aVar) {
        super(0);
        this.f318961l = linkedHashSet;
        this.f318962m = linkedHashMap;
        this.f318963n = cVar;
        this.f318964o = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str;
        C49113a c49113a;
        com.avito.android.db.sqlbrite.a aVar;
        Iterator it = this.f318961l.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c cVar = this.f318963n;
            str = cVar.f318968d;
            c49113a = cVar.f318970f;
            aVar = cVar.f318965a;
            if (!zHasNext) {
                break;
            }
            String str2 = (String) it.next();
            c49113a.getClass();
            aVar.a().delete("shared_preferences", c49113a.f440318b, new String[]{str2, str});
        }
        ContentValues contentValues = new ContentValues();
        for (Map.Entry entry : this.f318962m.entrySet()) {
            contentValues.clear();
            Object value = entry.getValue();
            c.a aVar2 = this.f318964o;
            aVar2.getClass();
            String strL = value instanceof Set ? c.this.f318966b.l(value) : value != null ? value.toString() : null;
            c49113a.getClass();
            contentValues.put("key", (String) entry.getKey());
            contentValues.put("value", strL);
            contentValues.put("file", str);
            Object value2 = entry.getValue();
            contentValues.put("type", value2 instanceof Integer ? IntParameter.TYPE : value2 instanceof Long ? Constants.LONG : value2 instanceof Boolean ? BooleanParameter.TYPE : value2 instanceof Set ? "string_set" : value2 instanceof Float ? "float" : value2 instanceof String ? "string" : "unknown");
            G0 g02 = G0.f406611a;
            aVar.a().insert("shared_preferences", null, contentValues);
        }
        return G0.f406611a;
    }
}
