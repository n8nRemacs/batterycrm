package su;

import Y61.k;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;

/* compiled from: ImageSendMessageRequestPayloadTable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/a;", "", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: su.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48415a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C48416b f438911a = new C48416b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f438912b = "image_send_request_payloads";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f438913c = "_id";

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f438914d = "request_id";

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f438915e = "operation_id";

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f438916f = "photo_id";

    @k
    public final String a() {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(this.f438912b);
        sb2.append(" (");
        sb2.append(this.f438913c);
        sb2.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        String str = this.f438914d;
        sb2.append(str);
        sb2.append(" INTEGER UNIQUE NOT NULL, ");
        sb2.append(this.f438915e);
        sb2.append(" TEXT NOT NULL, ");
        String str2 = this.f438916f;
        m.p(sb2, str2, " INTEGER NOT NULL, FOREIGN KEY(", str2, ") REFERENCES ");
        sb2.append(tu.b.f439641a);
        sb2.append('(');
        m.p(sb2, tu.b.f439642b, ") ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY(", str, ") REFERENCES send_message_requests(_id) ON DELETE CASCADE ON UPDATE CASCADE)");
        this.f438911a.getClass();
        return sb2.toString();
    }
}
