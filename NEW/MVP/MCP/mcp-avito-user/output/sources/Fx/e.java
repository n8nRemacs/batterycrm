package fx;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3NdTrxSearchParamsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b0\u0010\u001c¨\u00061"}, d2 = {"Lfx/e;", "", "", "attrId", "", "content", "", "currency", "currentValue", "defaultTitle", "dimension", "Lfx/b;", Navigation.DISPLAYING, "id", "Lfx/g;", "inputs", "type", "", "updatesForm", "Lfx/n;", "values", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lfx/b;Ljava/lang/String;Lfx/g;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/Long;", "getAttrId", "()Ljava/lang/Long;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCurrentValue", "()Ljava/lang/Object;", "getDefaultTitle", "getDimension", "Lfx/b;", "getDisplaying", "()Lfx/b;", "getId", "Lfx/g;", "getInputs", "()Lfx/g;", "getType", "Ljava/lang/Boolean;", "getUpdatesForm", "()Ljava/lang/Boolean;", "getValues", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c("attrId")
    @Y61.l
    private final Long attrId;

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final List<e> content;

    @com.google.gson.annotations.c("currency")
    @Y61.l
    private final String currency;

    @com.google.gson.annotations.c("currentValue")
    @Y61.l
    private final Object currentValue;

    @com.google.gson.annotations.c("defaultTitle")
    @Y61.l
    private final String defaultTitle;

    @com.google.gson.annotations.c("dimension")
    @Y61.l
    private final String dimension;

    @com.google.gson.annotations.c(Navigation.DISPLAYING)
    @Y61.l
    private final C40490b displaying;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("inputs")
    @Y61.l
    private final g inputs;

    @com.google.gson.annotations.c("type")
    @Y61.l
    private final String type;

    @com.google.gson.annotations.c("updatesForm")
    @Y61.l
    private final Boolean updatesForm;

    @com.google.gson.annotations.c("values")
    @Y61.l
    private final List<n> values;

    public e(@Y61.l Long l12, @Y61.l List<e> list, @Y61.l String str, @Y61.l Object obj, @Y61.l String str2, @Y61.l String str3, @Y61.l C40490b c40490b, @Y61.l String str4, @Y61.l g gVar, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l List<n> list2) {
        this.attrId = l12;
        this.content = list;
        this.currency = str;
        this.currentValue = obj;
        this.defaultTitle = str2;
        this.dimension = str3;
        this.displaying = c40490b;
        this.id = str4;
        this.inputs = gVar;
        this.type = str5;
        this.updatesForm = bool;
        this.values = list2;
    }
}
