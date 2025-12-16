package lH0;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.delegate.imv_poll.close.CloseArguments;
import com.avito.android.util.Kundle;
import fH0.AbstractC40291a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvClosePollPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlH0/c;", "LlH0/a;", "LfH0/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements InterfaceC43637a {

    /* renamed from: d, reason: collision with root package name */
    @l
    public CloseArguments f413689d;

    /* compiled from: ImvClosePollPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LlH0/c$a;", "", "<init>", "()V", "", "CLOSE_ARG_KEY", "Ljava/lang/String;", "IMV_POLL_STATE", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // lH0.InterfaceC43637a
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f413689d, "close_arg_key");
        return kundle;
    }
}
