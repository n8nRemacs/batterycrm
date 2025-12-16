package JK;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: DiffPrinter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LJK/f;", "T", "", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class f<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f8873a = new a(null);

    /* compiled from: DiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJK/f$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @n
    public static final <Type, PropertyT> void b(@k StringBuilder sb2, @l String str, Type type, Type type2, @k String str2, @k Y41.l<? super Type, ? extends PropertyT> lVar) {
        f8873a.getClass();
        String str3 = sb2.length() > 0 ? ", " : "";
        String strConcat = str != null ? str.concat(".") : "";
        PropertyT propertytInvoke = lVar.invoke(type);
        PropertyT propertytInvoke2 = lVar.invoke(type2);
        if (L.f(propertytInvoke, propertytInvoke2)) {
            return;
        }
        C43066x.j(sb2, str3, strConcat, str2, ContainerUtils.KEY_VALUE_DELIMITER, propertytInvoke2);
    }

    @n
    public static final <Type, PropertyT> void c(@k StringBuilder sb2, @l String str, @k f<PropertyT> fVar, Type type, Type type2, @k String str2, @k Y41.l<? super Type, ? extends PropertyT> lVar) {
        f8873a.getClass();
        String str3 = sb2.length() > 0 ? ", " : "";
        String strConcat = str != null ? str.concat(".") : "";
        PropertyT propertytInvoke = lVar.invoke(type);
        PropertyT propertytInvoke2 = lVar.invoke(type2);
        if (propertytInvoke != null && propertytInvoke2 != null) {
            fVar.a(sb2, r.q(strConcat, str2), propertytInvoke, propertytInvoke2);
        } else {
            if (L.f(propertytInvoke, propertytInvoke2)) {
                return;
            }
            C43066x.j(sb2, str3, strConcat, str2, ContainerUtils.KEY_VALUE_DELIMITER, propertytInvoke2);
        }
    }

    public abstract void a(@k StringBuilder sb2, @l String str, T t12, T t13);
}
