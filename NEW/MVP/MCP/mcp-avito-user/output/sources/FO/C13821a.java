package Fo;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SubscribeToTopicRequestV2.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LFo/a;", "", "", "LFo/a$a;", "topics", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getTopics", "()Ljava/util/List;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13821a {

    @c("topics")
    @k
    private final List<C0302a> topics;

    /* compiled from: SubscribeToTopicRequestV2.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LFo/a$a;", "", "", "type", "subType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getSubType", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo.a$a, reason: collision with other inner class name */
    public static final class C0302a {

        @c("subType")
        @l
        private final String subType;

        @c("type")
        @k
        private final String type;

        public C0302a(@k String str, @l String str2) {
            this.type = str;
            this.subType = str2;
        }
    }

    public C13821a(@k List<C0302a> list) {
        this.topics = list;
    }
}
