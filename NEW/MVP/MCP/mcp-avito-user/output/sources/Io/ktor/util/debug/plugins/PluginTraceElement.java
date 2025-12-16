package io.ktor.util.debug.plugins;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PluginsTrace.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement;", "", "PluginEvent", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PluginTraceElement {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PluginsTrace.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PluginEvent {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginEvent[] f400461b = {new PluginEvent("STARTED", 0), new PluginEvent("FINISHED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        PluginEvent EF5;

        public PluginEvent() {
            throw null;
        }

        public static PluginEvent valueOf(String str) {
            return (PluginEvent) Enum.valueOf(PluginEvent.class, str);
        }

        public static PluginEvent[] values() {
            return (PluginEvent[]) f400461b.clone();
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginTraceElement)) {
            return false;
        }
        ((PluginTraceElement) obj).getClass();
        return L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @k
    public final String toString() {
        return "PluginTraceElement(pluginName=null, handler=null, event=null)";
    }
}
