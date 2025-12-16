package H21;

import H21.a;
import Y41.q;
import Y61.k;
import Y61.l;
import com.yandex.div.internal.parser.x;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.c;
import com.yandex.div.json.e;
import com.yandex.div.json.expressions.d;
import com.yandex.div.json.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*^\u0010\b\u001a\u0004\b\u0000\u0010\u0000\")\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u00012)\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\t"}, d2 = {"T", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "Lcom/yandex/div/json/e;", "Lkotlin/S;", "name", "env", "Reader", "div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @k
    public static final <T> a<T> a(@l a<T> aVar, boolean z12) {
        if (aVar == null || aVar.equals(a.b.f6927c) || aVar.equals(a.c.f6928c)) {
            a.f6925b.getClass();
            return a.C0393a.a(z12);
        }
        if (aVar instanceof a.e) {
            return new a.e(((a.e) aVar).f6930c, z12);
        }
        if (aVar instanceof a.d) {
            return new a.d(z12, ((a.d) aVar).f6929c);
        }
        throw new IllegalStateException("Unknown field type");
    }

    public static final <T> T b(@k a<T> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k q<? super String, ? super JSONObject, ? super e, ? extends T> qVar) {
        if (aVar.f6926a && jSONObject.has(str)) {
            return qVar.invoke(str, jSONObject, eVar);
        }
        if (aVar instanceof a.e) {
            return ((a.e) aVar).f6930c;
        }
        if (aVar instanceof a.d) {
            return qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        throw j.g(str, jSONObject);
    }

    @k
    public static final d c(@k a aVar, @k e eVar, @k JSONObject jSONObject, @k q qVar) {
        if (aVar.f6926a && jSONObject.has("colors")) {
            return (d) qVar.invoke("colors", jSONObject, eVar);
        }
        if (aVar instanceof a.e) {
            return (d) ((a.e) aVar).f6930c;
        }
        if (aVar instanceof a.d) {
            return (d) qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        throw j.g("colors", jSONObject);
    }

    @l
    public static final <T> T d(@k a<T> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k q<? super String, ? super JSONObject, ? super e, ? extends T> qVar) {
        if (aVar.f6926a && jSONObject.has(str)) {
            return qVar.invoke(str, jSONObject, eVar);
        }
        if (aVar instanceof a.e) {
            return ((a.e) aVar).f6930c;
        }
        if (aVar instanceof a.d) {
            return qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        return null;
    }

    @l
    public static final List e(@k a aVar, @k e eVar, @k JSONObject jSONObject, @k x xVar, @k q qVar) {
        List list = (aVar.f6926a && jSONObject.has("transition_triggers")) ? (List) qVar.invoke("transition_triggers", jSONObject, eVar) : aVar instanceof a.e ? (List) ((a.e) aVar).f6930c : aVar instanceof a.d ? (List) qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar) : null;
        if (list == null) {
            return null;
        }
        if (xVar.isValid(list)) {
            return list;
        }
        eVar.getF370579a().a(j.e(jSONObject, "transition_triggers", list));
        return null;
    }

    @l
    public static final <T extends com.yandex.div.json.b> T f(@k a<? extends c<T>> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k q<? super String, ? super JSONObject, ? super e, ? extends T> qVar) {
        if (aVar.f6926a && jSONObject.has(str)) {
            return qVar.invoke(str, jSONObject, eVar);
        }
        if (aVar instanceof a.e) {
            try {
                return (T) ((c) ((a.e) aVar).f6930c).a(eVar, jSONObject);
            } catch (ParsingException e12) {
                eVar.getF370579a().a(e12);
            }
        } else if (aVar instanceof a.d) {
            return qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        return null;
    }

    @l
    public static final <T extends com.yandex.div.json.b> List<T> g(@k a<? extends List<? extends c<T>>> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k x<T> xVar, @k q<? super String, ? super JSONObject, ? super e, ? extends List<? extends T>> qVar) {
        List<? extends T> listInvoke;
        com.yandex.div.json.b bVarA;
        if (aVar.f6926a && jSONObject.has(str)) {
            listInvoke = qVar.invoke(str, jSONObject, eVar);
        } else if (aVar instanceof a.e) {
            Iterable iterable = (Iterable) ((a.e) aVar).f6930c;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                try {
                    bVarA = ((c) it.next()).a(eVar, jSONObject);
                } catch (ParsingException e12) {
                    eVar.getF370579a().a(e12);
                    bVarA = null;
                }
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            listInvoke = arrayList;
        } else {
            listInvoke = aVar instanceof a.d ? qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar) : null;
        }
        if (listInvoke == null) {
            return null;
        }
        if (xVar.isValid(listInvoke)) {
            return (List<T>) listInvoke;
        }
        eVar.getF370579a().a(j.e(jSONObject, str, listInvoke));
        return null;
    }

    @k
    public static final <T extends com.yandex.div.json.b> T h(@k a<? extends c<T>> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k q<? super String, ? super JSONObject, ? super e, ? extends T> qVar) {
        if (aVar.f6926a && jSONObject.has(str)) {
            return qVar.invoke(str, jSONObject, eVar);
        }
        if (aVar instanceof a.e) {
            try {
                return (T) ((c) ((a.e) aVar).f6930c).a(eVar, jSONObject);
            } catch (ParsingException e12) {
                throw j.a(jSONObject, str, e12);
            }
        }
        if (aVar instanceof a.d) {
            return qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        throw j.g(str, jSONObject);
    }

    @k
    public static final <T extends com.yandex.div.json.b> List<T> i(@k a<? extends List<? extends c<T>>> aVar, @k e eVar, @k String str, @k JSONObject jSONObject, @k x<T> xVar, @k q<? super String, ? super JSONObject, ? super e, ? extends List<? extends T>> qVar) {
        List<? extends T> listInvoke;
        com.yandex.div.json.b bVarA;
        if (aVar.f6926a && jSONObject.has(str)) {
            listInvoke = qVar.invoke(str, jSONObject, eVar);
        } else if (aVar instanceof a.e) {
            Iterable iterable = (Iterable) ((a.e) aVar).f6930c;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                try {
                    bVarA = ((c) it.next()).a(eVar, jSONObject);
                } catch (ParsingException e12) {
                    eVar.getF370579a().a(e12);
                    bVarA = null;
                }
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            listInvoke = arrayList;
        } else {
            if (!(aVar instanceof a.d)) {
                throw j.g(str, jSONObject);
            }
            listInvoke = qVar.invoke(((a.d) aVar).f6929c, jSONObject, eVar);
        }
        if (xVar.isValid(listInvoke)) {
            return listInvoke;
        }
        throw j.e(jSONObject, str, listInvoke);
    }
}
