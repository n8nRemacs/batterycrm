package op0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BbipErrorType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lop0/d;", "", "a", "b", "c", "Lop0/d$a;", "Lop0/d$b;", "Lop0/d$c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: BbipErrorType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/d$a;", "Lop0/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f420199a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420200b;

        public a() {
            this(null, 0, 3, null);
        }

        @Override // op0.d
        /* renamed from: a, reason: from getter */
        public final int getF420204b() {
            return this.f420200b;
        }

        @Override // op0.d
        @l
        /* renamed from: getText, reason: from getter */
        public final String getF420203a() {
            return this.f420199a;
        }

        public a(String str, int i12, int i13, C42822w c42822w) {
            str = (i13 & 1) != 0 ? null : str;
            i12 = (i13 & 2) != 0 ? R.string.bbip_error_forecast_message : i12;
            this.f420199a = str;
            this.f420200b = i12;
        }
    }

    /* compiled from: BbipErrorType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/d$b;", "Lop0/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f420201a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420202b;

        public b() {
            this(null, 0, 3, null);
        }

        @Override // op0.d
        /* renamed from: a, reason: from getter */
        public final int getF420204b() {
            return this.f420202b;
        }

        @Override // op0.d
        @l
        /* renamed from: getText, reason: from getter */
        public final String getF420203a() {
            return this.f420201a;
        }

        public b(String str, int i12, int i13, C42822w c42822w) {
            str = (i13 & 1) != 0 ? null : str;
            i12 = (i13 & 2) != 0 ? R.string.bbip_error_configurator_message : i12;
            this.f420201a = str;
            this.f420202b = i12;
        }
    }

    /* compiled from: BbipErrorType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop0/d$c;", "Lop0/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f420203a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420204b;

        public c() {
            this(null, 0, 3, null);
        }

        @Override // op0.d
        /* renamed from: a, reason: from getter */
        public final int getF420204b() {
            return this.f420204b;
        }

        @Override // op0.d
        @l
        /* renamed from: getText, reason: from getter */
        public final String getF420203a() {
            return this.f420203a;
        }

        public c(String str, int i12, int i13, C42822w c42822w) {
            str = (i13 & 1) != 0 ? null : str;
            i12 = (i13 & 2) != 0 ? R.string.bbip_error_screen_text : i12;
            this.f420203a = str;
            this.f420204b = i12;
        }
    }

    /* renamed from: a */
    int getF420204b();

    @l
    /* renamed from: getText */
    String getF420203a();
}
