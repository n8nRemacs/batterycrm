package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.e;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class PropertyBindingException extends MismatchedInputException {

    /* renamed from: f, reason: collision with root package name */
    public final Collection<Object> f341916f;

    /* renamed from: g, reason: collision with root package name */
    public transient String f341917g;

    public PropertyBindingException(JsonParser jsonParser, String str, e eVar, Collection collection) {
        super(jsonParser, str, eVar);
        this.f341916f = collection;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public final String d() {
        Collection<Object> collection;
        String str = this.f341917g;
        if (str != null || (collection = this.f341916f) == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = collection.size();
        if (size != 1) {
            sb2.append(" (");
            sb2.append(size);
            sb2.append(" known properties: ");
            Iterator<Object> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append('\"');
                sb2.append(String.valueOf(it.next()));
                sb2.append('\"');
                if (sb2.length() > 1000) {
                    sb2.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        } else {
            sb2.append(" (one known property: \"");
            sb2.append(String.valueOf(collection.iterator().next()));
            sb2.append('\"');
        }
        sb2.append("])");
        String string = sb2.toString();
        this.f341917g = string;
        return string;
    }
}
