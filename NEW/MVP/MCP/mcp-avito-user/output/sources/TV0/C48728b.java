package tv0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceRealtySheetStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltv0/b;", "Ltv0/a;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48728b implements InterfaceC48727a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f439663a;

    /* compiled from: ServiceRealtySheetStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ltv0/b$a;", "", "<init>", "()V", "", "SERVICES_REALTY_SHEET_CLICKED_KEY", "Ljava/lang/String;", "SERVICES_REALTY_SHEET_OPENED_KEY", "SERVICES_REALTY_SHEET_UX_FEEDBACK_SHOWN_KEY", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tv0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C48728b(@k l lVar) {
        this.f439663a = lVar;
    }

    @Override // tv0.InterfaceC48727a
    public final void a() {
        this.f439663a.putBoolean("services_realty_sheet_opened_key", true);
    }

    @Override // tv0.InterfaceC48727a
    public final void b() {
        this.f439663a.putBoolean("services_realty_sheet_clicked_key", true);
    }

    public final boolean c() {
        return this.f439663a.getBoolean("services_realty_sheet_clicked_key", false);
    }

    public final boolean d() {
        return this.f439663a.getBoolean("services_realty_sheet_opened_key", false);
    }
}
