package rz;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.entry_point_client_room.report.SendReportActivity;
import com.avito.android.entry_point_client_room.report.SendReportOpenParams;
import com.avito.android.util.C35961v3;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SendReportIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrz/b;", "Lrz/a;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47944b implements InterfaceC47943a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f437271a;

    @Inject
    public C47944b(@k Context context) {
        this.f437271a = context;
    }

    @Override // rz.InterfaceC47943a
    @k
    public final Intent a(@l Integer num, @l String str, @l String str2) {
        Intent intent = new Intent(this.f437271a, (Class<?>) SendReportActivity.class);
        C35961v3.b(intent, new SendReportOpenParams(str, str2, num));
        return intent;
    }
}
