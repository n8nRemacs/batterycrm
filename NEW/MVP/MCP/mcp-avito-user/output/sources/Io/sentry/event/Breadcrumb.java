package io.sentry.event;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes8.dex */
public class Breadcrumb implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Date f405161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f405162c;

    public enum Level {
        /* JADX INFO: Fake field, exist only in values array */
        DEBUG("debug"),
        /* JADX INFO: Fake field, exist only in values array */
        INFO(RequestReviewResultKt.INFO_TYPE),
        /* JADX INFO: Fake field, exist only in values array */
        WARNING(ConstraintKt.WARNING),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR("error"),
        /* JADX INFO: Fake field, exist only in values array */
        CRITICAL("critical");

        Level(String str) {
        }
    }

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        DEFAULT("default"),
        /* JADX INFO: Fake field, exist only in values array */
        HTTP("http"),
        /* JADX INFO: Fake field, exist only in values array */
        NAVIGATION("navigation"),
        /* JADX INFO: Fake field, exist only in values array */
        USER(ChannelContext.UserToUser.TYPE);

        Type(String str) {
        }
    }

    public Breadcrumb(String str) {
        Date date = new Date();
        if (str == null) {
            throw new IllegalArgumentException("one of 'message' or 'data' must be set");
        }
        this.f405161b = date;
        this.f405162c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) obj;
        return Objects.equals(this.f405161b, breadcrumb.f405161b) && Objects.equals(this.f405162c, breadcrumb.f405162c);
    }

    public final int hashCode() {
        return Objects.hash(null, this.f405161b, null, this.f405162c, null, null);
    }
}
