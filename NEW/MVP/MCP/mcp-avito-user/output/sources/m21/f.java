package M21;

import Y61.k;
import Y61.l;
import com.yandex.div.internal.util.h;
import com.yandex.div.internal.util.j;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.c;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: TemplateProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0001*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LM21/f;", "Lcom/yandex/div/json/c;", "T", "", "a", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface f<T extends com.yandex.div.json.c<?>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f10363a = a.f10364a;

    /* compiled from: TemplateProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM21/f$a;", "", "<init>", "()V", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10364a = new a();
    }

    @k
    default T a(@k String str, @k JSONObject jSONObject) {
        T t12 = (T) get(str);
        if (t12 != null) {
            return t12;
        }
        throw new ParsingException(ParsingExceptionReason.f370544b, AK.c.k("Template '", str, "' is missing!"), null, new h(jSONObject), j.b(jSONObject), 4, null);
    }

    @l
    T get(@k String str);
}
