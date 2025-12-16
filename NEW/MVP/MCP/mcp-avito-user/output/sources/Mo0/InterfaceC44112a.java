package mo0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TfaEnableApiV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmo0/a;", "", "a", "b", "Lmo0/a$a;", "Lmo0/a$b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44112a {

    /* compiled from: TfaEnableApiV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmo0/a$a;", "Lmo0/a;", "", "", "phoneList", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mo0.a$a, reason: collision with other inner class name */
    public static final class C11841a implements InterfaceC44112a {

        @c("phoneList")
        @k
        private final List<String> phoneList;

        public C11841a(@k List<String> list) {
            this.phoneList = list;
        }

        @k
        public final List<String> a() {
            return this.phoneList;
        }
    }

    /* compiled from: TfaEnableApiV2Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lmo0/a$b;", "Lmo0/a;", "", "isEnabled", "<init>", "(Z)V", "Z", "()Z", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mo0.a$b */
    public static final class b implements InterfaceC44112a {

        @c("isEnabled")
        private final boolean isEnabled;

        public b(boolean z12) {
            this.isEnabled = z12;
        }
    }
}
